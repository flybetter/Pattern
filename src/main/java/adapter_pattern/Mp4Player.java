package adapter_pattern;

/**
 * Created by wubingyu on 2017/2/26.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    public void PlayVlc(String fileName) {
        //什么也不做
    }

    public void PlayMp4(String fileName) {
        System.out.println("Playing mp4 file.Name:"+fileName);
    }
}
