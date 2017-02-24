package singleton_pattern.lazy_unsafe;

/**
 * Created by wubingyu on 2017/2/23.
 */
public class Singleton {
    private static Singleton instance;

    public Singleton() {
    }

    public static Singleton getInstance() {

        if (instance == null) {
            instance=new Singleton();
        }
        return instance;
    }
}
