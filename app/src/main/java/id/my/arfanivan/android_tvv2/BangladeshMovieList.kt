package id.my.arfanivan.android_tvv2

object BangladeshMovieList {
    val movies = listOf(
        Movie().apply {
            id = 0
            title = "Asian TV (720p)"
            studio = "-"
            videoUrl = "https://mtlivestream.site/asian/ytlive/index.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 1
            title = "Deshi TV (720p)"
            studio = "-"
            videoUrl = "https://deshitv.deshitv24.net/live/myStream/playlist.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 2
            title = "Ekushey TV (480p)"
            studio = "-"
            videoUrl = "https://ekusheyserver.com/etvlivesn.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 3
            title = "Boishakhi TV"
            studio = "-"
            videoUrl = "https://boishakhi.sonarbanglatv.com/boishakhi/boishakhitv/index.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        }
    )
}