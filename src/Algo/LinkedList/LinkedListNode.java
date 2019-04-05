package Algo.LinkedList;

public class LinkedListNode{
    public int value;
    public LinkedListNode next = null;

    public LinkedListNode(){

        this.value = -1;
        this.next = null;
    }

    public LinkedListNode(int value){
        this.value = value;
    }

    public String toString(LinkedListNode head){
    	if (head ==null) {
    		return null;
    	}
        String list = new String();
        LinkedListNode tail = head;

        while(tail != null){
            list = list +"->"+tail.value;
            tail = tail.next;
        }
        
        return list;
    }
}

