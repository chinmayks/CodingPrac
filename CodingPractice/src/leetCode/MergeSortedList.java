package leetCode;
/**
 * Definition for singly-linked list.
 * 
 */
class ListNode {
	 int val;
	 ListNode next;
	 ListNode(){}
	 ListNode(int x) { val = x; }
	 }
public class MergeSortedList {
	

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sortedlist = new ListNode();
        ListNode first = l1;
        ListNode second = l2;
        if(l1.val <= l2.val){
        	sortedlist = l1;
            first = first.next;
        } else {
        	sortedlist = l2;
            second = second.next;
        }
        
        while(first!= null && second != null){
            if(first.val <= second.val){
                sortedlist.next = first;
                sortedlist = sortedlist.next;
                first = first.next;
                
            }
            else {
            	sortedlist.next = second;
                sortedlist = sortedlist.next;
                second = second.next;
            }
        }
        if(first == null){
        	sortedlist.next = second;
        } else {
        	sortedlist.next = first;
        }
        
    	//Return the node of the list with smallest value first
        if(l1.val <= l2.val){
            return l1;
        } else {
            return l2;
        }
        
    }


	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		ListNode  result = new MergeSortedList().mergeTwoLists(l1, l2);
		while(result.next != null) {
			System.out.println(result.val);
			result = result.next;
		}
		

	}

}
