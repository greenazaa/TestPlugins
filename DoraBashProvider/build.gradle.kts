buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
    dependencies {
        classpath("com.github.recloudstream:cloudstream:4.5.2")
    }
}

apply(plugin = "cloudstream-plugin")

cloudstream {
    language = "hi"
    description = "Streams Hindi movies and shows from DoraBash"
    authors = listOf("greenazaa")

    status = 1 // 0 = Broken, 1 = Working, 2 = Partially working
    tvTypes = listOf("Movie", "TvSeries")

    iconUrl = "https://www.google.com/s2/favicons?domain=dorabash.com&sz=128"
}
