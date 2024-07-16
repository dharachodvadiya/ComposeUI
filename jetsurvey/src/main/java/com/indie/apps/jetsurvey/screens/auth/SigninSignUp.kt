package com.indie.apps.jetsurvey.screens.auth

import android.widget.NumberPicker.OnValueChangeListener
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.indie.apps.jetsurvey.R
import com.indie.apps.jetsurvey.ui.theme.ComposeUITheme

@Composable
fun Email(
    modifier: Modifier = Modifier
)
{
    OutlinedTextField(
        value = "",
        onValueChange = {},
        label = {
            Text(
                text = stringResource(id = R.string.email),
                style = MaterialTheme.typography.bodyMedium,
            )
        },
        modifier = modifier,
        textStyle = MaterialTheme.typography.bodyMedium,
        singleLine = true
    )


}

@Preview(showBackground = true)
@Composable
fun EmailPreview() {
    ComposeUITheme {
        Email(modifier = Modifier.padding(10.dp))
    }
}