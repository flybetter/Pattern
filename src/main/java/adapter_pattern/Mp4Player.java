package adapter_pattern;

/**
 * Created by wubingyu on 2017/2/26.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    public void PlayVlc(String fileName) {
        //ʲôҲ����
    }

    public void PlayMp4(String fileName) {
        System.out.println("Playing mp4 file.Name:"+fileName);
    }
}
