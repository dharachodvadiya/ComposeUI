package com.indie.apps.jetsurvey.screens

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.indie.apps.jetsurvey.R
import com.indie.apps.jetsurvey.ui.theme.ComposeUITheme

@Composable
internal fun OutLinedButton(@StringRes textRes: Int, onClick : () -> Unit, modifier: Modifier = Modifier)
{
    OutlinedButton(
        onClick = onClick,
        modifier = modifier
    ) {
        Text(
            text = stringResource(id = textRes),
            style = MaterialTheme.typography.titleSmall
        )
    }
}

@Composable
internal fun FilledButton(@StringRes textRes: Int, onClick : () -> Unit, modifier: Modifier = Modifier)
{
    Button(
        onClick = onClick,
        modifier = modifier
    ) {
        Text(
            text = stringResource(id = textRes),
            style = MaterialTheme.typography.titleSmall
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OutLinedButtonPreview() {
    ComposeUITheme {
        OutLinedButton(
            textRes = R.string.sign_in_guest,
            {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FilledButtonPreview() {
    ComposeUITheme {
        FilledButton(
            textRes = R.string.sign_in_guest,
            {}
        )
    }
}