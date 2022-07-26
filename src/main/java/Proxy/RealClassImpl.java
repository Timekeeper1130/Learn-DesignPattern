package Proxy;

/**
 * @author Timekeeper
 */
public class RealClassImpl implements IService{

    @Override
    public void download() {
        System.out.println("真实类操作");
    }
}
