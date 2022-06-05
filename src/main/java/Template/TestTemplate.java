package Template;

/**
 * @author WengHaoo
 */
public class TestTemplate {

    public void test() {
        AbstractTemplate one = new OneConcreteTemplate();
        AbstractTemplate two = new TwoConcreteTemplate();
        AbstractTemplate three = new ThreeConcreteTemplate();
        one.doSomething();
        two.doSomething();
        three.doSomething();
    }
}
