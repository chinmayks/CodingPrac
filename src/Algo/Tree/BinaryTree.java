package Algo.Tree;

import java.util.Stack;

public class BinaryTree {

    Treenode root;

    public Treenode getRoot() {
        return root;
    }

    public Treenode setRoot(int root) {
        this.root = new Treenode(root);
        return this.root;
    }

    public BinaryTree(){
        this.root = null;
    }

    public BinaryTree(Treenode root){
        this.root = root;
    }

    public Boolean isEmpty(){
        return this.root == null;
    }

    public void insert(int value){
        if(isEmpty()){
            this.root = setRoot(value);
        }
        else {
            _insert(this.root, value);
        }
    }

    public void _insert(Treenode node, int value){
        if(node != null){
            if (node.getNode() > value){
                if (node.getLeftChild() == null){
                    node.setLeftChild(new Treenode((value)));
                }
                else {
                    _insert(node.getLeftChild(),value);
                }

            }
            else {
                if (node.getRightChild() == null){
                    node.setRightChild(new Treenode(value));
                }
                else {
                    _insert(node.getRightChild(), value);
                }
            }
        }
    }
    public int depthFirstSearch(){
        if(!isEmpty()){
            Stack<Treenode> treeStack = new Stack<>();
            treeStack.push(getRoot());

            while(!treeStack.empty()){
                Treenode node = treeStack.pop();
                System.out.print(node.getNode()+" ");

                if(node.getRightChild() != null){
                    treeStack.push(node.getRightChild());
                }
                if(node.getLeftChild() != null){
                    treeStack.push(node.getLeftChild());
                }
            }
        }

        return 0;
    }
    public int dfs(){
        int minPath = 0;
        if(isEmpty()){
            return -1;
        }
        else {
             Treenode node = getRoot();
             minPath = pathSum(node);
        }

        return minPath;
    }

    public int pathSum(Treenode node){
        int sum = 0;

        if(node != null) {
            if (node.getLeftChild() != null && node.getRightChild() != null) {
                int leftsum = node.getNode() + pathSum(node.getLeftChild());
                int rightsum = node.getNode() + pathSum(node.getRightChild());
                sum = Math.min(leftsum, rightsum);
            }
            else if (node.getLeftChild() != null){
                sum = sum + node.getNode() + pathSum(node.getLeftChild());

            }
            else if(node.getRightChild() != null){
                sum = sum + node.getNode()+ pathSum(node.getRightChild());
            }

            else if (node.getLeftChild() == null && node.getRightChild() == null){
                return node.getNode();
            }
        }



        return sum;
    }


}
