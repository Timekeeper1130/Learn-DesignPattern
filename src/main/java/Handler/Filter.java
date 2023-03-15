package Handler;

public interface Filter {

    void doFilter(String request, String response, FilterChain chain) ;

}
