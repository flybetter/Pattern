package bridge_pattern;

/**
 * Created by wubingyu on 2017/2/27.
 */
public class RedCircle implements DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[color:red,radius:"+radius+",x:"+x+",y:"+y+"]");
    }
}
