package Algo.Tree;

public class CreateBtree {
	public BinaryTree createTree() {
		BinaryTree btree = new  BinaryTree();
        int[] bst = new int[]{10,9,11,-5, 11, 12};
        for(int tree_val : bst){
            btree.insert(tree_val);
        }
        
        return btree;
	}

}
