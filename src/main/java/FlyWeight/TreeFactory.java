package FlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 树工厂，封装创建享元对象的机制
 */
public class TreeFactory {

    private Map<String, TreeType> treeTypeMap = new HashMap<>();

    /**
     * 获取享元对象，如果对象不存在则创建并缓存
     */
    public TreeType getTreeType(String name, String color, String otherData) {
        String key = String.format("%s->%s->%s",name, color, otherData);
        TreeType treeType = treeTypeMap.get(key);
        if (treeType == null) {
            treeType = new TreeType(name, color, otherData);
            treeTypeMap.put(treeType.toString(), treeType);
            System.out.println("对象不存在，已缓存:" + treeType);
        }
        return treeType;
    }

}
