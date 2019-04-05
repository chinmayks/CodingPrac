package Algo.LinkedList;

import java.util.ArrayList;



public class ReverseLinkedListFromMiddle {

    public LinkedListNode reverseLinkedList(ArrayList<LinkedListNode> newList) {
        LinkedListNode node = newList.get(0);
        LinkedListNode start = null;
        LinkedListNode prev = null;
        LinkedListNode midLess = null;
        int size = 0;
        while(node != null){
            size += 1;
            node = node.next;
        }
        for(int i=1; i<size/2;i++){
            midLess = newList.get(i);
            start = newList.get(i+1);
        }
        prev = null;

        while(start != null){
            LinkedListNode temp = start.next;
            start.next = prev;
            prev = start;
            start = temp;

        }

        midLess.next = prev;

        LinkedListNode ne = newList.get(0);
        while (ne != null){
            System.out.print(ne.value+ "->");
            ne = ne.next;

        }
        System.out.print("null");


        return null;
    }

    public static void main(String args[]){
        LinkedListNode start = null;
        LinkedListNode prev = null;
        LinkedListNode last = null;
        ArrayList<LinkedListNode> newList = new ArrayList<>();
        for(int i=1;i<=8;i++){
            if (i==1){
                start = new LinkedListNode(i);
                prev = start;
                newList.add(start);
                System.out.print(start.value +"->");
            }
            else{
                LinkedListNode node = new LinkedListNode(i);
                prev.next = node;
                node.next = last;
                prev = node;
                System.out.print(node.value +"->");
                newList.add(node);

            }
        }
        System.out.println("null");
        ReverseLinkedListFromMiddle rev = new ReverseLinkedListFromMiddle();
        rev.reverseLinkedList(newList);



    }

}
