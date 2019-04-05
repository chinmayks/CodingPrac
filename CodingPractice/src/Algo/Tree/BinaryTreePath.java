package Algo.Tree;
import java.util.*;
/**
 * 257 Given a binary tree, return all root-to-leaf paths.
 * Note: A leaf is a node with no children.
 * @author chinmaysingh
 *
 */
public class BinaryTreePath {
	
	public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return null;
        
        Stack<TreeNode> main = new Stack<TreeNode>();
        Stack<TreeNode> backtrace = new Stack<TreeNode>();
        main.push(root);
        List<String> result = new ArrayList<String>();
        while(!main.isEmpty()){
            TreeNode node = main.pop();
            backtrace.push(node);
            if(node.getRightChild() != null) main.push(node.getRightChild());
            if(node.getLeftChild() != null) main.push(node.getLeftChild());
            if(node.getLeftChild() == null && node.getRightChild() == null){
                Iterator it = backtrace.iterator();
                String path = "";
                if(it.hasNext()) {
                	TreeNode ode = (TreeNode)it.next();
                	path = ""+ode.getNode();
                }
                while(it.hasNext()){
                	TreeNode ode = (TreeNode)it.next();
                    path = path+"->" +ode.getNode();
                }
                result.add(path);
                while(backtrace.peek().getRightChild() == null || (!main.isEmpty() && backtrace.peek().getRightChild() != main.peek())){
                    backtrace.pop();
                }
            }
            
        }
        return result;
    }

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.setLeftChild(new TreeNode(2));
		root.setRightChild(new TreeNode(3));
		root.getLeftChild().setRightChild(new TreeNode(5));
		
		new BinaryTreePath().binaryTreePaths(root);

	}

}
