package Strategy;

/**
 * 策略模式测试
 *
 * @author WengHaoo
 */
public class TestStrategy {

    public void test() {
        int a = 10, b = 20;
        strategyCompute(new AddStrategy(), a, b);
        strategyCompute(new SubStrategy(), a, b);
        strategyCompute(new MultiStrategy(), a, b);
        strategyCompute(new DivStrategy(), a, b);
    }

    public void strategyCompute(IStrategy strategy, int a, int b) {
        strategy.compute(a, b);
    }

}
