package Algo.Tree;

public class TreeNode {
    private int node;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int root){
        this.node = root;
        this.leftChild = null;
        this.rightChild = null;
    }


    public int getNode() {
        return node;
    }

    public void setNode(int node) {
        this.node = node;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}

