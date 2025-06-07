package id.my.arfanivan.android_tvv2

object SingaporeMovieList {
    val movies = listOf(
        Movie().apply {
            id = 0
            title = "CNA International (1080p)"
            studio = "-"
            videoUrl = "https://d2e1asnsl7br7b.cloudfront.net/7782e205e72f43aeb4a48ec97f66ebbe/index.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 1
            title = "meWATCH LIVE 1 (1080p)"
            studio = "-"
            videoUrl = "https://tglmp04.akamaized.net/out/v1/898b1cbac7c747e3b1f3deb460e9b67e/manifest.mpd"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 2
            title = "AXN Asia (576p)"
            studio = "-"
            videoUrl = "http://125hvt.ddns.net:21585/axn/index.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        }
    )
}