package id.my.arfanivan.android_tvv2

object AlgeriaMovieList {
    val movies = listOf(
        Movie().apply {
            id = 0
            title = "AL24 News (1080p)"
            studio = "-"
            videoUrl = "https://cdn.live.easybroadcast.io/abr_corp/66_al24_u4yga6h/playlist.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 1
            title = "Amou Yazid TV (576p)"
            studio = "-"
            videoUrl = "http://mkstream.servehttp.com:1940/AmouYazid/ay1/playlist.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 2
            title = "CNA (Chaîne Nord Africaine) (360p) [Not 24/7]"
            studio = "-"
            videoUrl = "https://live.creacast.com/cna/smil:cna.smil/playlist.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 3
            title = "TV3"
            studio = "-"
            videoUrl = "http://69.64.57.208/canalalgerie/playlist.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        }
    )
}