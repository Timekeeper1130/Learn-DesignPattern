package FlyWeight;

/**
 * 森林中的每个树对象
 */
public class Tree {

    /**
     * 树类型（享元对象）
     */
    private TreeType treeType;

    /**
     * 树的高度
     */
    private int height;

    /**
     * 树的宽度
     */
    private int width;

    public Tree() {

    }
    public Tree(TreeType treeType, int height, int width) {
        this.treeType = treeType;
        this.height = height;
        this.width = width;
    }


    public TreeType getTreeType() {
        return treeType;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
