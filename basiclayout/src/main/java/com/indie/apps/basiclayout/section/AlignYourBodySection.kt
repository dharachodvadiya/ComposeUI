package com.indie.apps.basiclayout.section
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.indie.apps.basiclayout.item.AlignYourBodyElement
import com.indie.apps.basiclayout.data.Data
import com.indie.apps.basiclayout.ui.theme.ComposeUITheme

@Composable
internal fun AlignYourBodyRow(
    modifier: Modifier = Modifier
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ) {
        items(Data.alignYourBodyData) { item ->
            AlignYourBodyElement(item.drawable, item.text)
        }
    }
}

@Preview(showBackground = true)
@Composable
internal fun AlignYourBodyRowPreview() {
    ComposeUITheme {
        AlignYourBodyRow(Modifier.padding(8.dp))
    }
}