package com.developersancho.jetrorty.provider

import androidx.navigation.NavController
import com.developersancho.characters.detail.destinations.CharacterDetailScreenDestination
import com.developersancho.episodes.detail.destinations.EpisodeDetailScreenDestination
import com.developersancho.locations.detail.destinations.LocationDetailScreenDestination
import com.developersancho.provider.NavigationProvider
import com.developersancho.settings.destinations.AboutScreenDestination
import com.developersancho.settings.destinations.LanguageScreenDestination
import com.developersancho.settings.destinations.TermsAndPrivacyScreenDestination
import com.ramcosta.composedestinations.navigation.navigate

class AppNavigationProvider constructor(
    private val navController: NavController
) : NavigationProvider {

    override fun openCharacterDetail(characterId: Int) {
        navController.navigate(CharacterDetailScreenDestination(characterId))
    }

    override fun openEpisodeDetail(episodeId: Int) {
        navController.navigate(EpisodeDetailScreenDestination(episodeId))
    }

    override fun openLocationDetail(locationId: Int) {
        navController.navigate(LocationDetailScreenDestination(locationId))
    }

    override fun openTermAndPrivacy() {
        navController.navigate(TermsAndPrivacyScreenDestination)
    }

    override fun openAppLanguage() {
        navController.navigate(LanguageScreenDestination)
    }

    override fun openAbout() {
        navController.navigate(AboutScreenDestination)
    }

    override fun navigateUp() {
        navController.navigateUp()
    }
}