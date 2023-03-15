package Handler;

public class FirstFilter implements Filter{

    int order = 1;

    /**
     * 这种方法是 由链来决定下一个调用者是谁
     */
    @Override
    public void doFilter(String request, String response, FilterChain chain) {
        System.out.println("this is first --before");
        chain.doFilter(request, response);
        System.out.println("this is first --after");
    }
}
