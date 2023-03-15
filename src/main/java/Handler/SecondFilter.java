package Handler;

public class SecondFilter implements Filter{

    int order = 2;

    private Filter nextFilter;

    public void setNextFilter(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }

    /**
     * 这种方法是 由链来决定下一个调用者是谁
     */
    @Override
    public void doFilter(String request, String response, FilterChain chain) {
        System.out.println("this is second --before");
        chain.doFilter(request, response);
        System.out.println("this is second --after");
    }
}
