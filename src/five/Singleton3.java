package five;

public class Singleton3 {

    private volatile static Singleton3 uniqueInstance;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton3.class) {
                if (uniqueInstance == null ) { // 防止多线程进入时多次初始化
                    uniqueInstance = new Singleton3();
                }
            }
        }
        return uniqueInstance;
    }

}
