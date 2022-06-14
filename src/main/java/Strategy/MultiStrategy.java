package Strategy;

/**
 * @author WengHaoo
 */
public class MultiStrategy implements IStrategy{
    @Override
    public void compute(int a, int b) {
        System.out.println("a * b = " + (a * b));
    }
}
