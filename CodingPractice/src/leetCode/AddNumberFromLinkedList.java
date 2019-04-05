package leetCode;
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
    
    public LinkedListNode reverse(LinkedListNode list) {
    	LinkedListNode prev = null;
    	LinkedListNode head = list;
    	while(head != null) {
    		LinkedListNode curr = head;
    		LinkedListNode temp = curr.next;
    		curr.next = prev;
    		prev = curr;
    		head = temp;
    	}
    	
    	return prev;
    }
    
    public LinkedListNode addTwoNumberss(LinkedListNode l1, LinkedListNode l2) {
        if(l1 ==null && l2==null) return null;
        LinkedListNode pointer = l1;
        int factor =1;
        long n1 =0;
        long n2 =0;
        while(pointer != null){
            n1 += pointer.value*factor;
            pointer = pointer.next;
            factor *= 10;
        }
        pointer = l2;
        factor = 1;
        while(pointer != null){
            n2 += (long)pointer.value*factor;
            //System.out.println(n2);
            pointer = pointer.next;
            factor *= 10;
        }
        long sum = (n1 + n2);
        System.out.println(sum +" "+n1+" "+n2);
        //System.out.println((int)sum%10);
        LinkedListNode sumlist = new LinkedListNode(0);
        pointer = sumlist;
        //sum /=10;
        while(sum >0){
            int qu = (int)sum/10;
            int rem = (int)sum%10;
            LinkedListNode ln = new LinkedListNode(rem);
            pointer.next = ln;
            pointer = pointer.next;
            sum = qu;
        }
        return sumlist;
        
    }
    
    public LinkedListNode addTwoNumbersss(LinkedListNode l1, LinkedListNode l2) {
    	l1 = reverse(l1);
    	l2 = reverse(l2);
    	LinkedListNode head1 = l1;
    	LinkedListNode head2 = l2;
    	LinkedListNode result = null;
    	LinkedListNode rslt_head = result;
    	int carry = 0;
    	while(head1 != null && head2 != null) {
    		int nodeval = head1.value + head2.value + carry;
    		carry = nodeval /10;
    		LinkedListNode node = new LinkedListNode(nodeval%10);
    		if(result == null) {
    			result = node;
    			rslt_head = result;
    		}
    		else {
    			result.next = node;
        		result = result.next;
    		}
    		
    		head1 = head1.next;
    		head2 = head2.next;
    		
    	}
    	while(head1 != null) {
    		int nodeval = head1.value + carry;
    		carry = nodeval /10;
    		LinkedListNode node = new LinkedListNode(nodeval%10);
    		if(result == null) result = node;
    		else {
    			result.next = node;
        		result = result.next;
    		}
    		head1 = head1.next;
    	}
    	while(head2 != null) {
    		int nodeval = head2.value + carry;
    		carry = nodeval /10;
    		LinkedListNode node = new LinkedListNode(nodeval%10);
    		if(result == null) result = node;
    		else {
    			result.next = node;
        		result = result.next;
    		}
    		head2 = head2.next;
    	}
    	if(carry>0) {
    		LinkedListNode node = new LinkedListNode(carry);
    		result.next = node;
    		result = result.next;
    	}
    	
    	
    	return rslt_head;
    }
    public LinkedListNode createLinkedList(int [] arr) {
    	LinkedListNode llist = new LinkedListNode();
    	LinkedListNode head = llist;
    	for(int i:arr) {
    		LinkedListNode node = new LinkedListNode(i);
    		head.next = node;
    		head = head.next;
    	}
    	
    	
    	
    	return llist.next;
    }

    public static void main(String args[]){
    	int n = 2147483647;
    	System.out.println(n);
    	LinkedListNode l1 = new LinkedListNode(2);
    	l1.next = new LinkedListNode(4);
    	l1.next.next = new LinkedListNode(3);
    	LinkedListNode l2 = new LinkedListNode(5);
    	l2.next = new LinkedListNode(6);
    	l2.next.next = new LinkedListNode(4);
    	//LinkedListNode result = new AddNumberFromLinkedList().addTwoNumbers(l1, l2);
    	int [] ll1 = new int[] {1,8};
    	int [] ll2 = new int[] {0};
    	LinkedListNode llist1 = new AddNumberFromLinkedList().createLinkedList(ll1);
    	LinkedListNode llist2 = new AddNumberFromLinkedList().createLinkedList(ll2);
    	LinkedListNode result = new AddNumberFromLinkedList().addTwoNumbersss(llist1, llist2);
    	System.out.println(result.toString(result));
    	
    	
    	
    	
        

    }
}
