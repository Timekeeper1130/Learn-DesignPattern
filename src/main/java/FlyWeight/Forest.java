package FlyWeight;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    private List<Tree> trees;

    public boolean addTree(Tree tree) {
        if (trees == null || trees.size() == 0) {
            trees = new ArrayList<>();
        }
        return trees.add(tree);
    }

    public void getTreeInfo() {
        if (trees == null || trees.size() == 0) {
            return;
        }
        for (Tree t : trees) {
            System.out.println("----------------------------------");
            System.out.println("这是树信息:" + t);
            System.out.println("这是树类型信息:" + t.getTreeType().getSuperToString());
        }
    }
}
