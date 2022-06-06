import Builder.TestBuilder;
import Singleton.TestSingleton;
import Template.TestTemplate;

/**
 * @author WengHaoo
 */
public class Application {

    public static void main(String[] args) {
//        template();
//        builder();
//        singleton();
    }

    /**
     * 模板
     */
    private static void template() {
        TestTemplate testTemplate = new TestTemplate();
        testTemplate.test();
    }

    /**
     * 构造者
     */
    private static void builder() {
        // Q:我直接在set里面return this不行么，为什么需要builder?
        // A:有了builder，能够保证创建对象时通过构造方法进行某些值的校验，而链式set不行
        TestBuilder testBuilder = new TestBuilder();
        testBuilder.test();
    }

    /**
     * 单例
     */
    private static void singleton() {
        TestSingleton testSingleton = new TestSingleton();
        testSingleton.test();
    }
}
