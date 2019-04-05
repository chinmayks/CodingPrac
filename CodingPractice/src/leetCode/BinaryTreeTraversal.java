package leetCode;
import java.util.*;
import Algo.Tree.TreeNode;
/**
 * 102. Binary Tree Level Order Traversal
 * @author chinmaysingh
 *
 */

public class BinaryTreeTraversal {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return null;
        List<List<Integer>> nodelist = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(root.getNode());
        nodelist.add(temp);
        int itr = 0;
        int level = 1;
        temp = new ArrayList<Integer>();
        while(queue.size()!= 0){
            //temp = new ArrayList<Integer>();
            TreeNode node = queue.poll();
            if(node.getLeftChild() != null){
                temp.add(node.getLeftChild().getNode());
                queue.add(node.getLeftChild());
            }
            if(node.getRightChild() != null){
                temp.add(node.getRightChild().getNode());
                queue.add(node.getRightChild());
            }
            
            itr += 2;
            System.out.println(nodelist.get(nodelist.size()-1));
            if(itr >= Math.pow(2,level)){
            	if(temp.size()!= 0) nodelist.add(temp);
                level++;
                itr = 0;
                temp = new ArrayList<Integer>();
            }
            System.out.println(nodelist.toString());
        }
        return nodelist;
            
        
    }

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.setLeftChild(new TreeNode(2));
		node.setRightChild(new TreeNode(3));
		node.getLeftChild().setLeftChild(new TreeNode(4));
		node.getLeftChild().setRightChild(null);
		node.getRightChild().setLeftChild(null);
		node.getRightChild().setRightChild(new TreeNode(5));
		
		BinaryTreeTraversal btt = new BinaryTreeTraversal();
		btt.levelOrder(node);
		
		
		

	}

}
