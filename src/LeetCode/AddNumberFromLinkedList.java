package LeetCode;
import Algo.LinkedList.LinkedListNode;


public class AddNumberFromLinkedList {

    public LinkedListNode addTwoNumbers(LinkedListNode l1, LinkedListNode l2){
    	l1 = reverseLinkedList(l1);
    	l2 = reverseLinkedList(l2);
    	System.out.println(new LinkedListNode().toString(l1));
    	System.out.println(new LinkedListNode().toString(l2));
    	LinkedListNode tail = l1;
    	String lt1 = "";
    	String lt2 = "";
    	while(tail != null) {
    		lt1 = lt1 + tail.value;
    		tail = tail.next;
    		
    	}
    	tail = l2;
    	while(tail != null) {
    		lt2 = lt2 + tail.value;
    		tail = tail.next;
    		
    	}
    	int n1 = Integer.parseInt(lt1);
    	int n2 = Integer.parseInt(lt2);
    	int result = n1 + n2;
    	
    	LinkedListNode rslt = new LinkedListNode();
    	String rs = ""+result;
    	for(int i=0; i<rs.length();i++) {
    		
    	}
    	return l1;
    }

    public LinkedListNode reverseLinkedList(LinkedListNode l1) {
    	String list = new LinkedListNode().toString(l1);
    	String reverseList = "";
    	for(int i=0; i<list.length();i++) {
    		reverseList = reverseList + list.charAt(i); 
    	}
    	LinkedListNode head;
    	for(int j=0;j<reverseList.length(); j++) {
    		head = new LinkedListNode(reverseList.charAt(j));
    		LinkedListNode tail = head.next;
    	}
    	return l1;
    }

    public static void main(String args[]){
    	LinkedListNode l1 = new LinkedListNode(2);
    	l1.next = new LinkedListNode(4);
    	l1.next.next = new LinkedListNode(3);
    	LinkedListNode l2 = new LinkedListNode(5);
    	l2.next = new LinkedListNode(6);
    	l2.next.next = new LinkedListNode(4);
    	LinkedListNode result = new AddNumberFromLinkedList().addTwoNumbers(l1, l2);
    	
    	
        

    }
}
