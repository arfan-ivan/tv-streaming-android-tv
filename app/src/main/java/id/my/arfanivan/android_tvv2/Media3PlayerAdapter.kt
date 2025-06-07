package id.my.arfanivan.android_tvv2

import android.content.Context
import androidx.leanback.media.PlayerAdapter
import androidx.media3.exoplayer.ExoPlayer

class Media3PlayerAdapter(
    private val context: Context,
    private val player: ExoPlayer
) : PlayerAdapter() {

    // Hapus variabel callback dan method setCallback karena setCallback final di superclass

    override fun play() {
        player.play()
    }

    override fun pause() {
        player.pause()
    }

    override fun isPlaying(): Boolean = player.isPlaying

    override fun getDuration(): Long = player.duration

    override fun getCurrentPosition(): Long = player.currentPosition

    override fun seekTo(position: Long) {
        player.seekTo(position)
    }

    override fun getBufferedPosition(): Long = player.bufferedPosition

    override fun next() {}

    override fun previous() {}

    override fun fastForward() {}

    override fun rewind() {}

    override fun setProgressUpdatingEnabled(enabled: Boolean) {
        // Optional: implement jika diperlukan
    }
}
