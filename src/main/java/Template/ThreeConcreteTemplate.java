package Template;

/**
 * @author WengHaoo
 */
public class ThreeConcreteTemplate extends AbstractTemplate{

    @Override
    void firstDoSomething() {
        System.out.println("i am third template -- first do something");
    }

    @Override
    void secondDoSomething() {
        System.out.println("i am third template -- second do something");
    }

    @Override
    void thirdDoSomething() {
        System.out.println("i am third template -- third do something");
    }

    @Override
    void afterDoSomething() {
        System.out.println("i am third template -- after do something");
    }
}
