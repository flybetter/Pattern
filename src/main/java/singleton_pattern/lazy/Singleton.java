package java.singleton_pattern.lazy;

/**
 * Created by wubingyu on 2017/2/23.
 */
public class Singleton {
    private static Singleton instance=new Singleton();

    public Singleton() {
    }
    public static Singleton getInstance(){
        return instance;
    }
}
