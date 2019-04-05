package crackingTheCodingInterview;

import Algo.LinkedList.CreateDemoList;
import Algo.LinkedList.LinkedListNode;

public class LL_FromNthToLast {
	
	public LinkedListNode fromNthToLastNode(LinkedListNode head, int nth) {
		int counter = 1;
		while(head != null && counter <= nth) {
			if(counter == nth) {
				return head;
			}
			else {
				head = head.next;
				counter++;
			}
		}
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode head = new CreateDemoList().createList();
		System.out.println(head.toString(head));
		LinkedListNode obj = new LL_FromNthToLast().fromNthToLastNode(head, 2);
		System.out.println(obj.toString(obj));

	}

}
