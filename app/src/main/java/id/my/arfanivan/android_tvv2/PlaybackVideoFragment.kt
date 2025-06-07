package id.my.arfanivan.android_tvv2

import android.net.Uri
import android.os.Bundle
import androidx.leanback.app.VideoSupportFragment
import androidx.leanback.app.VideoSupportFragmentGlueHost
import androidx.leanback.media.MediaPlayerAdapter
import androidx.leanback.media.PlaybackTransportControlGlue
import androidx.leanback.widget.PlaybackControlsRow

/** Handles video playback with media controls. */
class PlaybackVideoFragment : VideoSupportFragment() {

    private lateinit var mTransportControlGlue: PlaybackTransportControlGlue<MediaPlayerAdapter>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val movie = activity?.intent?.getSerializableExtra("movie") as? Movie
        movie?.let {
            val (_, title, description, _, _, videoUrl) = it

            val glueHost = VideoSupportFragmentGlueHost(this@PlaybackVideoFragment)
            val playerAdapter = MediaPlayerAdapter(activity)
            playerAdapter.setRepeatAction(PlaybackControlsRow.RepeatAction.INDEX_NONE)

            mTransportControlGlue = PlaybackTransportControlGlue(requireActivity(), playerAdapter)
            mTransportControlGlue.host = glueHost
            mTransportControlGlue.title = title
            mTransportControlGlue.subtitle = description
            mTransportControlGlue.playWhenPrepared()

            playerAdapter.setDataSource(Uri.parse(videoUrl))
        }
    }

    override fun onPause() {
        super.onPause()
        mTransportControlGlue.pause()
    }
}
