package com.indie.apps.basiclayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.indie.apps.basiclayout.item.SearchBar
import com.indie.apps.basiclayout.navigation.SootheBottomNavigation
import com.indie.apps.basiclayout.navigation.SootheNavigationRail
import com.indie.apps.basiclayout.section.AlignYourBodyRow
import com.indie.apps.basiclayout.section.FavoriteCollectionsGrid
import com.indie.apps.basiclayout.section.HomeSection
import com.indie.apps.basiclayout.ui.theme.ComposeUITheme
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass

class BasicLayoutMainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val windowSizeClass = calculateWindowSizeClass(this)
            MySootheApp(windowSizeClass)
        }
    }
}

@Composable
fun MySootheApp(windowSize: WindowSizeClass) {
    when (windowSize.widthSizeClass) {
        WindowWidthSizeClass.Compact -> {
            MyAppPortrait()
        }
        WindowWidthSizeClass.Expanded -> {
            MyAppLandscape()
        }
    }
}

@Composable
fun MyAppLandscape() {
    ComposeUITheme {
        Row {
            SootheNavigationRail()
            HomeScreen()
        }
    }
}

@Composable
fun MyAppPortrait() {
    ComposeUITheme {
        Scaffold(
            bottomBar = { SootheBottomNavigation() }
        ) { innerPadding ->
            HomeScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}


@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(modifier
        .verticalScroll(rememberScrollState())
    ) {
        Spacer(Modifier.height(16.dp))
        SearchBar(Modifier.padding(horizontal = 16.dp))
        HomeSection(title = R.string.align_your_body) {
            AlignYourBodyRow()
        }
        HomeSection(title = R.string.favorite_collections) {
            FavoriteCollectionsGrid()
        }
        Spacer(Modifier.height(16.dp))
    }
}


@Preview(showBackground = true, widthDp = 1280, heightDp = 720)
@Composable
fun landScapePreview() {
    ComposeUITheme {
        MyAppLandscape()
    }
}

@Preview(showBackground = true, widthDp = 720, heightDp = 1280)
@Composable
fun portraitPreview() {
    ComposeUITheme {
        MyAppPortrait()
    }
}