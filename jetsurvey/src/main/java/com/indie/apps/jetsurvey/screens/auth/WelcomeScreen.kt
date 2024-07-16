package com.indie.apps.jetsurvey.screens.auth

import android.content.Intent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.indie.apps.jetsurvey.JetSurveyMainActivity
import com.indie.apps.jetsurvey.R
import com.indie.apps.jetsurvey.screens.FilledButton
import com.indie.apps.jetsurvey.screens.OutLinedButton
import com.indie.apps.jetsurvey.ui.theme.ComposeUITheme
import com.indie.apps.jetsurvey.ui.theme.stronglyDeemphasizedAlpha

@Composable
internal fun WelcomeScreen(
    onSignInSignUp: (email: String) -> Unit,
    onSignInAsGuest: () -> Unit,
) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
        ) {
            SignInCreateAccount(
                onSignInSignUp = onSignInSignUp,
                onSignInAsGuest = onSignInAsGuest,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp))
        }
    }
}

@Composable
private fun SignInCreateAccount(
    onSignInSignUp: (email: String) -> Unit,
    onSignInAsGuest: () -> Unit,
    modifier: Modifier = Modifier
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Spacer(modifier = Modifier.height(64.dp))

        Text(
            text = stringResource(id = R.string.sign_in_create_account),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = stronglyDeemphasizedAlpha),
        )

        Spacer(modifier = Modifier.height(12.dp))

        Email(modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.height(20.dp))

        FilledButton(
            textRes = R.string.user_continue,
            onClick = { onSignInSignUp("Hello") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = stringResource(id = R.string.or),
            style = MaterialTheme.typography.titleSmall,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = stronglyDeemphasizedAlpha),
            )

        Spacer(modifier = Modifier.height(20.dp))

        OutLinedButton(
            textRes = R.string.sign_in_guest,
            onClick = onSignInAsGuest,
            modifier = Modifier.fillMaxWidth()
        )

    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    ComposeUITheme {
        WelcomeScreen({},{})
    }
}