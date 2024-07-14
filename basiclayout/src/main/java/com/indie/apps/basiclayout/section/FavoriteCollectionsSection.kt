package com.indie.apps.basiclayout.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.indie.apps.basiclayout.item.FavoriteCollectionCard
import com.indie.apps.basiclayout.data.Data
import com.indie.apps.basiclayout.ui.theme.ComposeUITheme

@Composable
 internal fun FavoriteCollectionsGrid(
    modifier: Modifier = Modifier
) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.height(168.dp)
    ) {
        items(Data.favoriteCollectionsData) { item ->
            FavoriteCollectionCard(item.drawable, item.text)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FavoriteCollectionsGridPreview() {
    ComposeUITheme {
        FavoriteCollectionsGrid(Modifier.padding(8.dp))
    }
}