package prototype_pattern;

/**
 * Created by wubingyu on 2017/2/26.
 */
public class Circle extends Shape {
    public Circle() {
        type="Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle:draw() method");
    }
}
