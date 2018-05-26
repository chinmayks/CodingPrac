package Algo;
import java.util.*;

public class HashMapSort {

    public static void main(String args[]){
        HashMap<String,Integer> marks = new HashMap<>();

        marks.put("Cks", 100);
        marks.put("vir", 10);
        marks.put("bha", 90);
        marks.put("har", 180);
        List list = new LinkedList(marks.entrySet());
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2){
                return ((Comparable)((Map.Entry)(o2)).getKey()).compareTo(((Map.Entry)(o1)).getKey());
            }
        });
        System.out.println(list.get(0));
        list.add(150);
    }



}
