package singleton_pattern;

/**
 * Created by wubingyu on 2017/2/25.
 */
public class SingletonObject {
    private static SingletonObject instance=new SingletonObject();

    private SingletonObject(){

    }

    public static  SingletonObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("hello world!");
    }
}
