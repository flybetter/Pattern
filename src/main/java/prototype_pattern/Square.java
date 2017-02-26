package prototype_pattern;

/**
 * Created by wubingyu on 2017/2/26.
 */
public class Square extends Shape{
    public Square() {
        type="Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square:draw() method.");
    }
}
