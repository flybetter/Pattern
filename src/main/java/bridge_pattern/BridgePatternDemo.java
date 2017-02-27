package bridge_pattern;

/**
 * Created by wubingyu on 2017/2/27.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle=new Circle(100,100,10,new RedCircle());
        Shape greenCircle=new Circle(100,100,10,new GreenCircle());

        redCircle.draw();
        greenCircle.draw();


    }
}
