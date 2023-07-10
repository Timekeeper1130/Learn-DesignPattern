package FlyWeight;

/**
 * 树的类型
 */
public class TreeType {

    /**
     * 名称
     */
    private String name;

    /**
     * 颜色
     */
    private String color;

    /**
     * 其他数据
     */
    private String otherData;

    public TreeType(String name, String color, String otherData) {
        this.name = name;
        this.color = color;
        this.otherData = otherData;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOtherData() {
        return otherData;
    }

    public void setOtherData(String otherData) {
        this.otherData = otherData;
    }

    @Override
    public String toString() {

        return String.format("%s->%s->%s",this.name, this.color, this.otherData);
    }

    public String getSuperToString() {
        return super.toString();
    }
}
