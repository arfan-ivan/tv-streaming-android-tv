package id.my.arfanivan.android_tvv2

object LibyaMovieList {
    val movies = listOf(
        Movie().apply {
            id = 0
            title = "Al Masar TV (576p)"
            studio = "-"
            videoUrl = "https://starmenajo.com/hls/almasar/index.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 1
            title = "February Channel (1080p)"
            studio = "-"
            videoUrl = "https://b01c02nl.mediatriple.net/videoonlylive/mtfknklgwrlive/broadcast_5dc818c793576.smil/playlist.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 2
            title = "Libya Al Wataniya (360p)"
            studio = "-"
            videoUrl = "https://cdn-globecast.akamaized.net/live/eds/libya_al_watanya/hls_roku/index.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 3
            title = "Salam TV (1080p)"
            studio = "-"
            videoUrl = "https://amsart-live.ercdn.net/salamtv/salamtv.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        }
    )
}