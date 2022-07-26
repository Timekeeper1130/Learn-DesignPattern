package Proxy;

/**
 * 真实类的代理类
 *
 * @author Timekeeper
 */
public class ProxyClassImpl implements IService{

    private final IService iService;

    private final Boolean isCache;

    public ProxyClassImpl(IService iService, Boolean isCache) {
        this.iService = iService;
        this.isCache = isCache;
    }

    @Override
    public void download() {
        System.out.println("代理类记录日志开始-------");
        if (isCache) {
            System.out.println("已缓存，无需访问真实对象");
        } else {
            System.out.println("未缓存，需要访问真实对象");
            iService.download();
        }
        System.out.println("代理类记录日志结束-------");
    }
}
