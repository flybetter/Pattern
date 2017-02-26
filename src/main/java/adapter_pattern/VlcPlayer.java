package adapter_pattern;

/**
 * Created by wubingyu on 2017/2/26.
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    public void PlayVlc(String fileName) {
        System.out.println("Playing vlc file.name:"+fileName);
    }

    public void PlayMp4(String fileName) {
        //什么也不做
    }
}
