plugins {
    kotlin("jvm") version "1.6.10"
}

apply(from = "https://raw.githubusercontent.com/recloudstream/cloudstream/master/build.plugin.gradle.kts")

cloudstream {
    language = "hi"
    description = "Streams Hindi movies and shows from DoraBash"
    authors = listOf("greenazaa")

    status = 1 // 0 = Broken, 1 = Working, 2 = Partially working
    tvTypes = listOf("Movie", "TvSeries")

    iconUrl = "https://www.google.com/s2/favicons?domain=dorabash.com&sz=128"
}
