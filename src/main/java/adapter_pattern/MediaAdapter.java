package adapter_pattern;

/**
 * Created by wubingyu on 2017/2/26.
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer =new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer=new Mp4Player();
        }

    }

    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.PlayVlc(filename);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.PlayMp4(filename);
        }
    }
}
