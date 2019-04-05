package Algo.Tree;

public class MinPathFromRootToNode {

    public static void main(String args[]){
        BinaryTree btree = new  BinaryTree();
        int[] bst = new int[]{10,9,11,-5};
        for(int tree_val : bst){
            btree.insert(tree_val);
        }
        btree.depthFirstSearch();
        System.out.println();
        System.out.println(btree.dfs());

    }
}
