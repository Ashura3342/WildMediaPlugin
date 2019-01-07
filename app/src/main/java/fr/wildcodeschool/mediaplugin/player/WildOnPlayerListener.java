package fr.wildcodeschool.mediaplugin.player;

import android.media.MediaPlayer;

public interface WildOnPlayerListener {
  void onPrepared(MediaPlayer mp);
  void onCompletion(MediaPlayer mp);
}
