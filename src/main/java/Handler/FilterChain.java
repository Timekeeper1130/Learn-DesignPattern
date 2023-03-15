package Handler;

public interface FilterChain {

    void doFilter(String request, String response);

    FilterChain addFilter(Filter filter);
}
