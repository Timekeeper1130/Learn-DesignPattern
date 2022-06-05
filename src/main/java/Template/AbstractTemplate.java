package Template;

/**
 * @author WengHaoo
 */
public abstract class AbstractTemplate {

    /**
     * 第一步
     *
     * @author WengHaoo
     */
    abstract void firstDoSomething();

    /**
     * 第二步
     *
     * @author WengHaoo
     */
    abstract void secondDoSomething();

    /**
     * 第三步
     *
     * @author WengHaoo
     */
    abstract void thirdDoSomething();

    /**
     * 前缀步骤做完后
     *
     * @author WengHaoo
     */
    abstract void afterDoSomething();

    /**
     * 具体要做的事
     *
     * @author WengHaoo
     */
    protected void doSomething() {
        firstDoSomething();
        secondDoSomething();
        thirdDoSomething();
        System.out.println("now I am a common do something");
        afterDoSomething();
        System.out.println("----------------one done");
    }
}
