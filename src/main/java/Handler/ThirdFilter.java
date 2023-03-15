package Handler;

public class ThirdFilter implements Filter{

    int order = 3;

    private Filter nextFilter;

    public void setNextFilter(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }

    /**
     * 这种方法是 由链来决定下一个调用者是谁
     */
    @Override
    public void doFilter(String request, String response, FilterChain chain) {
        System.out.println("this is third --before");
        chain.doFilter(request, response);
        System.out.println("this is third --after");
    }
}
