package Singleton;

/**
 * @author WengHaoo
 */
public class TestSingleton {

    public void test() {
        LazySingleton l1 = LazySingleton.getInstance();
        LazySingleton l2 = LazySingleton.getInstance2();
        LazySingleton l3 = LazySingleton.getInstance3();
        EagerSingleton l4 = EagerSingleton.getInstance();
    }
}
