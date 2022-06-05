import Builder.TestBuilder;
import Template.TestTemplate;

/**
 * @author WengHaoo
 */
public class Application {

    public static void main(String[] args) {
//        template();
        builder();
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
        TestBuilder testBuilder = new TestBuilder();
        testBuilder.test();
    }
}
