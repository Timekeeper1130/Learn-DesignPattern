package Strategy;

/**
 * @author WengHaoo
 */
public class SubStrategy implements IStrategy{
    @Override
    public void compute(int a, int b) {
        System.out.println("a - b = " + (a - b));
    }
}
