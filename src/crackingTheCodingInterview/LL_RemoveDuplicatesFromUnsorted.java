package crackingTheCodingInterview;
import java.util.Hashtable;

import Algo.LinkedList.LinkedListNode;

public class LL_RemoveDuplicatesFromUnsorted {
	
	public LinkedListNode usingBufferSpace(LinkedListNode head) {
		LinkedListNode current = head.next;
		LinkedListNode previous = head;
		Hashtable<Integer, Integer> htable = new Hashtable<Integer, Integer>();
		htable.put(head.value, 1);
		while(current != null) {
			if(htable.containsKey(current.value)) {
				previous.next = current.next;
				current = current.next;
			}
			else {
				htable.put(current.value, 1);
				previous = current;
				current = current.next;
			}
		}
		
		return head;
	}
	public LinkedListNode withoutUsingBufferSpace(LinkedListNode head) {
		if(head == null) {
			return null;
		}
		LinkedListNode current = head;
		
		while(current != null) {
			LinkedListNode previous = current;
			LinkedListNode runner = current.next;
			while(runner != null) {
				if(current.value == runner.value) {
					previous.next = runner.next;
					runner = runner.next;
				}
				else {
					previous = runner;
					runner = runner.next;
				}
			}
			current = current.next;
		}
		return head;
	}
	
	
	
	public static void main(String args[]) {
		LinkedListNode head = new LinkedListNode(1);
		head.next = new LinkedListNode(123);
		head.next.next = new LinkedListNode(1);
		head.next.next.next = new LinkedListNode(1);
		head.next.next.next.next = new LinkedListNode(1);
		LL_RemoveDuplicatesFromUnsorted obj = new LL_RemoveDuplicatesFromUnsorted();
		//head = obj.usingBufferSpace(head);
		head = obj.withoutUsingBufferSpace(head);
		System.out.println(head.toString(head));
	}

}
