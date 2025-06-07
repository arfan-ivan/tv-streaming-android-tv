package id.my.arfanivan.android_tvv2

object AngolaMovieList {
    val movies = listOf(
        Movie().apply {
            id = 0
            title = "KK TV Angola (1080p)"
            studio = "-"
            videoUrl = "https://w1.manasat.com/ktv-angola/smil:ktv-angola.smil/playlist.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 1
            title = "Muzangala TV (1080p)"
            studio = "-"
            videoUrl = "https://5cf4a2c2512a2.streamlock.net/tvmuzangala/tvmuzangala/playlist.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 2
            title = "TV Zimbo (1080p)"
            studio = "-"
            videoUrl = "https://sgn-cdn-video.vods2africa.com/Tv-Zimbo/index.fmp4.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 3
            title = "TPA Noticias"
            studio = "-"
            videoUrl = "https://live20.bozztv.com/dvrfl06/astv/astv-tpaint/index.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        }
    )
}