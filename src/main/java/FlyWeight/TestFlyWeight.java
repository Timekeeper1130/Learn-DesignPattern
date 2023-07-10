package FlyWeight;

public class TestFlyWeight {

    public void test() {
        TreeFactory treeFactory = new TreeFactory();
        TreeType treeType1 = treeFactory.getTreeType("红叶", "red", null);
        Tree tree1 = new Tree(treeType1, 10, 20);
        // -----------------------------------
        TreeType treeType2 = treeFactory.getTreeType("枫叶","orange", "otherD");
        Tree tree2 = new Tree(treeType2, 100, 200);
        // -----------------------------------
        TreeType treeType3 = treeFactory.getTreeType("红叶", "red", null);
        Tree tree3 = new Tree(treeType3, 1000, 2000);

        Forest forest = new Forest();
        forest.addTree(tree1);
        forest.addTree(tree2);
        forest.addTree(tree3);
        forest.getTreeInfo();

    }

}
