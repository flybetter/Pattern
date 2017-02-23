package java.singleton_pattern.laz_safe;

/**
 * Created by wubingyu on 2017/2/23.
 */
public class Singleton {

    private static   Singleton instance;

    public Singleton() {
    }

    public static synchronized Singleton getInstance(){
        if (instance == null) {
            instance= new Singleton();
        }
       return  instance;

    }
}
