package prototype_pattern;

/**
 * Created by wubingyu on 2017/2/26.
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type="Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Retangle:draw()method");
    }
}
