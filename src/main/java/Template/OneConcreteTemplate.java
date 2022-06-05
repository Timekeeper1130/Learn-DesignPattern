package Template;

/**
 * @author WengHaoo
 */
public class OneConcreteTemplate extends AbstractTemplate{

    @Override
    void firstDoSomething() {
        System.out.println("i am one template -- first do something");
    }

    @Override
    void secondDoSomething() {
        System.out.println("i am one template -- second do something");
    }

    @Override
    void thirdDoSomething() {
        System.out.println("i am one template -- third do something");

    }

    @Override
    void afterDoSomething() {
        System.out.println("i am one template -- after do something");
    }
}
