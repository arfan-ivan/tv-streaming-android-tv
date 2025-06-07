package id.my.arfanivan.android_tvv2

object MalaysiaMovieList {
    val movies = listOf(
        Movie().apply {
            id = 0
            title = "Astro Awani (720p)"
            studio = "-"
            videoUrl = "https://d2idp3hzkhjpih.cloudfront.net/out/v1/4b85d9c2bf97413eb0c9fd875599b837/index.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 1
            title = "Maah TV (720p) [Not 24/7]"
            studio = "-"
            videoUrl = "https://hls.maahtv.live/hls/stream.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 2
            title = "RTM ASEAN"
            studio = "-"
            videoUrl = "https://d25tgymtnqzu8s.cloudfront.net/event/smil:event1/chunklist_b2596000_slENG.m3u8"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 3
            title = "Sukan RTM [Geo-blocked]"
            studio = "-"
            videoUrl = "https://d25tgymtnqzu8s.cloudfront.net/smil:sukan/manifest.mpd"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 4
            title = "TV1 [Geo-blocked]"
            studio = "-"
            videoUrl = "https://d25tgymtnqzu8s.cloudfront.net/smil:tv1/manifest.mpd"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        },
        Movie().apply {
            id = 5
            title = "TV2 [Geo-blocked]"
            studio = "-"
            videoUrl = "https://d25tgymtnqzu8s.cloudfront.net/smil:tv2/manifest.mpd"
            cardImageUrl = "https://example.com/default.jpg"
            backgroundImageUrl = "https://example.com/default.jpg"
        }
    )
}