package Proxy;

/**
 * @author Timekeeper
 */
public class TestProxy {

    public void test() {
        IService real = new RealClassImpl();
        IService proxy = new ProxyClassImpl(real, false);
        proxy.download();
    }
}
