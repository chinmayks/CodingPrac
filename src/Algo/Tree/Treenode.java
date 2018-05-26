package Algo.Tree;

class Treenode {
    private int node;
    private Treenode leftChild;
    private Treenode rightChild;

    public Treenode(int root){
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

    public Treenode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Treenode leftChild) {
        this.leftChild = leftChild;
    }

    public Treenode getRightChild() {
        return rightChild;
    }

    public void setRightChild(Treenode rightChild) {
        this.rightChild = rightChild;
    }
}

