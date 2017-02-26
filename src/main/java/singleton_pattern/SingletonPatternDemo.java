package singleton_pattern;

/**
 * Created by wubingyu on 2017/2/25.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
         //Singleton obbject=new Singleton();

         SingletonObject object=SingletonObject.getInstance();

         object.showMessage();
    }

}
