object Configs {
    private const val versionMajor = 1
    private const val versionMinor = 0
    private const val versionPatch = 0
    private const val versionQualifier = "alpha1"

    private fun generateVersionCode(): Int {
        return versionMajor * 10000 + versionMinor * 100 + versionPatch
    }

    private fun generateVersionName(): String {
        return "$versionMajor.$versionMinor.$versionPatch"
    }

    const val Id = "com.developersancho.jetrorty"
    val VersionCode = generateVersionCode()
    val VersionName = generateVersionName()
    const val MinSdk = 26
    const val TargetSdk = 33
    const val CompileSdk = 33
    const val AndroidJunitRunner = "androidx.test.runner.AndroidJUnitRunner"
    val FreeCompilerArgs = listOf(
        "-Xjvm-default=all",
        "-opt-in=kotlin.RequiresOptIn",
        "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
        "-opt-in=kotlinx.coroutines.InternalCoroutinesApi",
        "-opt-in=kotlinx.coroutines.FlowPreview",
        "-opt-in=androidx.compose.material.ExperimentalMaterialApi",
        "-opt-in=com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi",
        "-opt-in=androidx.compose.animation.ExperimentalAnimationApi"
    )

    val FreeCoroutineCompilerArgs = listOf(
        "-Xjvm-default=all",
        "-opt-in=kotlin.RequiresOptIn",
        "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
        "-opt-in=kotlinx.coroutines.InternalCoroutinesApi",
        "-opt-in=kotlinx.coroutines.FlowPreview"
    )

    object Release {
        const val BaseUrl = "https://rickandmortyapi.com/api/"
        const val DbName = "RortyDb"
    }

    object Debug {
        const val BaseUrl = "https://rickandmortyapi.com/api/"
        const val DbName = "RortyDb"
    }
}