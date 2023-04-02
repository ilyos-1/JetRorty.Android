package com.developersancho.home

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.developersancho.characters.list.CharactersScreen
import com.developersancho.episodes.list.EpisodesScreen
import com.developersancho.locations.list.LocationsScreen
import com.developersancho.provider.NavigationProvider
import com.developersancho.settings.SettingsScreen
import com.developersancho.theme.JetRortyColors
import com.developersancho.theme.RalewayFonts
import com.developersancho.theme.selectedBottomItemColor
import com.developersancho.theme.unselectedBottomItemColor
import com.google.accompanist.insets.navigationBarsHeight
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph

@RootNavGraph(start = true)
@Destination
@Composable
fun HomeScreen(navigator: NavigationProvider) {
    val scaffoldState = rememberScaffoldState()
    val (currentBottomTab, setCurrentBottomTab) = rememberSaveable {
        mutableStateOf(BottomBarHomeItem.CHARACTERS)
    }
    val bottomSheetState = rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)

    Crossfade(currentBottomTab) { bottomTab ->
        Scaffold(
            scaffoldState = scaffoldState,
            bottomBar = { HomeBottomNavigation(bottomTab, setCurrentBottomTab) },
            content = {
                val modifier = Modifier.padding(it)
                when (bottomTab) {
                    BottomBarHomeItem.CHARACTERS -> CharactersScreen(
                        modifier = modifier,
                        navigator = navigator,
                        bottomSheetState = bottomSheetState
                    )
                    BottomBarHomeItem.EPISODES -> EpisodesScreen(
                        modifier = modifier,
                        navigator = navigator
                    )
                    BottomBarHomeItem.LOCATIONS -> LocationsScreen(
                        modifier = modifier,
                        navigator = navigator
                    )
                    BottomBarHomeItem.SETTINGS -> SettingsScreen(
                        modifier = modifier,
                        navigator = navigator
                    )
                }
            }
        )
    }
}

@Composable
private fun HomeBottomNavigation(
    bottomTab: BottomBarHomeItem,
    setCurrentBottomTab: (BottomBarHomeItem) -> Unit
) {
    val bottomBarHeight = 56.dp
    val pages = BottomBarHomeItem.values()

    BottomNavigation(
        backgroundColor = JetRortyColors.primary,
        modifier = Modifier
            .fillMaxWidth()
            .navigationBarsHeight(bottomBarHeight)
    ) {
        pages.forEach { page ->
            val selected = page == bottomTab
            val selectedLabelColor = if (selected) {
                selectedBottomItemColor
            } else {
                unselectedBottomItemColor
            }
            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = rememberVectorPainter(image = page.icon),
                        contentDescription = stringResource(page.title)
                    )
                },
                label = {
                    Text(
                        text = stringResource(page.title),
                        color = selectedLabelColor,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = RalewayFonts
                    )
                },
                selected = selected,
                onClick = {
                    setCurrentBottomTab.invoke(page)
                },
                selectedContentColor = selectedBottomItemColor,
                unselectedContentColor = unselectedBottomItemColor,
                alwaysShowLabel = true,
                modifier = Modifier.navigationBarsPadding()
            )
        }
    }
}