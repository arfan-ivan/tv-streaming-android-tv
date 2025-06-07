package id.my.arfanivan.android_tvv2

object BahamasMovieList {
    val movies = listOf(
        Movie().apply {
            id = 0
            title = "Guardian Talk Radio (1080p)"
            studio = "-"
            videoUrl = "https://cdn-edge1.streamcomedia.com/abr_tngr969fm/abr-tngr969fm_streams/playlist.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 1
            title = "Island Luck TV"
            studio = "-"
            videoUrl = "https://cdn3.wowza.com/5/dFA0TmRpeFdNVXhT/NetUp/ILTV.stream/playlist.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        }
    )
}