package adapter_pattern;

/**
 * Created by wubingyu on 2017/2/26.
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    public void play(String audioType, String filename) {

        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file.name:"+filename);
        }else if(audioType.equalsIgnoreCase("vlc")
                ||audioType.equalsIgnoreCase("mp4")
                ){
            mediaAdapter =new MediaAdapter(audioType);
            mediaAdapter.play(audioType,filename);
        }else{
            System.out.println("Invalid media."+audioType+"format not supported");
        }

    }
}
