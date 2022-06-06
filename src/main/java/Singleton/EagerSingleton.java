package Singleton;

/**
 * 这是一个饿汉式单例模式
 *
 * @author WengHaoo
 */
public class EagerSingleton {

    private static final EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton() {

    }

    /**
     * 由于单例对象在类加载时创建，不存在线程安全问题，简单粗暴，但有可能造成资源浪费
     */
    public static EagerSingleton getInstance() {
        return singleton;
    }
}
