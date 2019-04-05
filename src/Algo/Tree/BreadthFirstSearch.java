package Algo.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author {Chinmay Singh}
 * 26-May-2018
 * BreadthFirstSearch.java
 */

public class BreadthFirstSearch {
	/**
	 * 
	 *  @param node
	 *  @return void
	 */
	public void bfs(BinaryTree node) {
		if(!node.isEmpty()) {
			Queue<Treenode> queue = new LinkedList<Treenode>();
			Treenode root = node.getRoot();
			queue.add(node.getRoot());
			while(!queue.isEmpty()) {
				root = (Treenode) queue.poll();
				System.out.println(root.getNode());
				if(root.getLeftChild() != null){
                	queue.add(root.getLeftChild());
                }
				if(root.getRightChild() != null){
					queue.add(root.getRightChild());
                }
				
							
                
			}
		}
	}

	public static void main(String[] args) {
		BinaryTree btree = new CreateBtree().createTree();
		BreadthFirstSearch bfs = new BreadthFirstSearch();
		bfs.bfs(btree);
		

	}

}
