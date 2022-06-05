package Template;

/**
 * @author WengHaoo
 */
public class TwoConcreteTemplate extends AbstractTemplate{

    @Override
    void firstDoSomething() {
        System.out.println("i am two template -- first do something");
    }

    @Override
    void secondDoSomething() {
        System.out.println("i am two template -- second do something");
    }

    @Override
    void thirdDoSomething() {
        System.out.println("i am two template -- third do something");
    }

    @Override
    void afterDoSomething() {
        System.out.println("i am two template -- after do something");
    }
}
