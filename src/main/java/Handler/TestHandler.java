package Handler;

public class TestHandler {

    /**
     * 这种方式是 由将链信息传递给每个filter节点，每个filter节点处理完数据后，再调用链上的doFilter()方法
     * 具体下一个filter节点是谁，当前filter并不知晓，由链来进行全局控制
     */
    public void test() {
        Filter a = new FirstFilter();
        Filter b = new SecondFilter();
        Filter c = new ThirdFilter();

        FilterChain filterChain = new FilterChainImpl();
        // 根据order排序...
        filterChain.addFilter(a).addFilter(b).addFilter(c);
        filterChain.doFilter("request string", "response string");
    }

}
