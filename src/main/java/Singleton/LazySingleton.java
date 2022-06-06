package Singleton;

/**
 * 这是一个懒汉式单例类（只有调用到才进行初始化）
 *
 * WengHaoo
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {

    }

    /**
     * 线程不安全
     */
    public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }

    /**
     * 线程安全，但由于锁加在方法上，所以效率低
     */
    public synchronized static LazySingleton getInstance2() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }

    /**
     * 线程安全，利用双重校验，只有同一批进入第一步if的那些线程会被锁住等待，效率高。
     */
    public static LazySingleton getInstance3() {
        if (singleton == null) {
            synchronized (LazySingleton.class) {
                if (singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;
    }
}
