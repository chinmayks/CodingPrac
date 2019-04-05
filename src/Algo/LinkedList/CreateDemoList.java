package Algo.LinkedList;

public class CreateDemoList {
	
	public LinkedListNode createList() {
		LinkedListNode head = new LinkedListNode(1);
		head.next = new LinkedListNode(2);
		head.next.next = new LinkedListNode(2);
		head.next.next.next = new LinkedListNode(1);
		head.next.next.next.next = new LinkedListNode(3);
		return head;
	}

}
