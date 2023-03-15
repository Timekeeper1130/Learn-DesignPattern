package Handler;

import java.util.ArrayList;
import java.util.List;

public class FilterChainImpl implements FilterChain{

    List<Filter> filters = new ArrayList<>();

    int index = 0;

    @Override
    public void doFilter(String request, String response) {
        if (hasFilter()) {
            Filter filter = filters.get(index);
            index++;
            filter.doFilter(request, response, this);
        } else {
            System.out.println("进入了servlet容器");
        }
    }

    /**
     * 往链上增加过滤器节点
     */
    @Override
    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    private boolean hasFilter() {
        return index < filters.size();
    }

}
