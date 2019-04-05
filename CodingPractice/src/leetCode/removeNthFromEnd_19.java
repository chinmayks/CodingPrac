package leetCode;
import Algo.LinkedList.*;

import java.util.LinkedList;
import java.util.Queue;


public class removeNthFromEnd_19 {

    public LinkedListNode removeNthFromEnd(LinkedListNode head, int n) {

        if(head == null){
            return null;
        }
        LinkedListNode s =head;
        LinkedListNode tail = head;
        for(int i =0; i<n;i++){
            if(tail != null) {
                tail = tail.next;
            }

        }
        LinkedListNode prev = tail;
        if(tail == null){
            head = s.next;
            return head;
        }
        while(tail.next != null){
            s = s.next;
            tail = tail.next;

        }

        if(s.next.next == null){
            s.next = s.next.next;
            return head;
        }
        s.next = s.next.next;
        return head;

    }

    public static void main(String args[]){
        LinkedListNode Llist = new LinkedListNode(1);
        LinkedListNode head = Llist;
        LinkedListNode tail = Llist;

        for(int i = 2; i<3;i++){

            LinkedListNode node =  new LinkedListNode(i);
            tail.next = node;
            tail = node;

        }
        removeNthFromEnd_19 remN = new removeNthFromEnd_19();
        System.out.println(Llist.toString(remN.removeNthFromEnd(head,1)));
    }
}
