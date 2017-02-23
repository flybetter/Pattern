package singleton_pattern.double_check;

/**
 * Created by wubingyu on 2017/2/23.
 */
public class Singleton {
    private  volatile static  Singleton singleton;

    public Singleton() {
    }

    public static Singleton getSingleton(){
        if (singleton == null) {
            synchronized (Singleton.class){
                if (singleton == null) {
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }
}
