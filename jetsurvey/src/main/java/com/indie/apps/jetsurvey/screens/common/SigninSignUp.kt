package com.indie.apps.jetsurvey.screens.common

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.indie.apps.jetsurvey.R
import com.indie.apps.jetsurvey.ui.theme.ComposeUITheme

@Composable
internal fun Email(
    emailState: TextFieldState = remember { EmailState() },
    modifier: Modifier = Modifier,
    imeAction: ImeAction = ImeAction.Next,
    onImeAction: () -> Unit = {}
){
    OutlinedTextField(
        value = emailState.text,
        onValueChange = {
            emailState.text = it
        },
        label = {
            Text(
                text = stringResource(id = R.string.email),
                style = MaterialTheme.typography.bodyMedium,
            )
        },
        modifier = modifier
            .fillMaxWidth()
            .onFocusChanged { focusState ->
                emailState.onFocusChange(focusState.isFocused)

                if (!focusState.isFocused) {
                    emailState.enableShowErrors()
                }
            },
        textStyle = MaterialTheme.typography.bodyMedium,
        isError = emailState.showErrors(),
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = imeAction,
            keyboardType = KeyboardType.Email
        ),
        keyboardActions = KeyboardActions(
            onDone = {
                onImeAction()
            }
        ),
        singleLine = true
    )

    emailState.getError()?.let { error -> TextFieldError(textError = error) }


}

@Composable
internal fun TextFieldError(textError: String) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = textError,
            modifier = Modifier.fillMaxWidth(),
            color = MaterialTheme.colorScheme.error
        )
    }
}

@Preview(showBackground = true)
@Composable
fun EmailPreview() {
    ComposeUITheme {
      //  Email(email = "", modifier = Modifier.padding(10.dp))
    }
}