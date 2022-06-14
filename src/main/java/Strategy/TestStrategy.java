package Strategy;

import java.util.function.Supplier;

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
        // 当然也能使用lambda
        strategyCompute((c, d) -> System.out.println("我是lambda method：" + (c + d)), a, b);
        IStrategy l = (c, d) -> System.out.println("lambda new：" + (c-d));
        l.compute(1, 100);
    }

    public void strategyCompute(IStrategy strategy, int a, int b) {
        strategy.compute(a, b);
    }
    public Integer t(Supplier<Integer> strategy) {
        return strategy.get();
    }

}
