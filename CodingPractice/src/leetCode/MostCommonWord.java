package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MostCommonWord {
	
	public static String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> hset = new HashSet<>(Arrays.asList(banned));
        HashMap<String, Integer> hmap = new HashMap<>();
        String []para = paragraph.split("[ .,&?'!:;$%()\\-\"]+");
        for(String word:para) {
        	if(hmap.containsKey(word.toLowerCase())) {
        		hmap.put(word.toLowerCase(), hmap.get(word.toLowerCase())+1);
        	}else {
        		if(!hset.contains(word.toLowerCase()))
        			hmap.put(word.toLowerCase(), 1);
        	}
        }
        LinkedList<Map.Entry<String,Integer>> llist = new LinkedList<>(hmap.entrySet());
        Collections.sort(llist, new Comparator<Map.Entry<String, Integer>>(){
        	
        	public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        		return o2.getValue().compareTo(o1.getValue());
        	}
        	
        	
        });
        
        System.out.println(llist.toString());
        //Iterator it = hmap.entrySet().iterator();
        Iterator it = llist.iterator();
        int max_freq = Integer.MIN_VALUE;
        ArrayList<String> final_result = new ArrayList<String>();
        while(it.hasNext()) {
        	Map.Entry<String, Integer> pair = (Map.Entry<String, Integer>) it.next();
        	if(pair.getValue() >= max_freq) {
        		max_freq = pair.getValue();
        		final_result.add(pair.getKey());
        	}else {
        		break;
        	}
        	
        }
        Collections.sort(final_result);
        System.out.println(final_result);
        
        
        return final_result.get(0);
    }
	
	public static String mostCommonWords(String paragraph, String[] banned) {
        HashSet<String> hset = new HashSet<>(Arrays.asList(banned));
        HashMap<String, Integer> hmap = new HashMap<>();
        ArrayList<String> final_result = new ArrayList<>();
        ArrayList<String> prime_result = new ArrayList<>();
        int max_freq = Integer.MIN_VALUE;
        String []para = paragraph.split("[ .,'&?!:;$%()\\-\"]+");
        for(String word:para) {
        	if(hmap.containsKey(word.toLowerCase())) {
        		hmap.put(word.toLowerCase(), hmap.get(word.toLowerCase())+1);
                if(hmap.get(word.toLowerCase()) > max_freq){
                    max_freq = hmap.get(word.toLowerCase());
                    final_result = new ArrayList<>();
                    final_result.add(word.toLowerCase());
                }
                else if(hmap.get(word.toLowerCase()) == max_freq){
                    final_result.add(word.toLowerCase());
                }
        	}else {
        		if(!hset.contains(word.toLowerCase())){
                    hmap.put(word.toLowerCase(), 1);
                    prime_result.add(word.toLowerCase());
                    //max_freq = 1;
                }
        			
                
        	}
        }
       
        
        if(final_result.size() != 0){
            Collections.sort(final_result); 
            return final_result.get(0);
        }
        else{
            Collections.sort(prime_result);
            return prime_result.get(0);
        }
	}

	public static void main(String[] args) {
		String s = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = new String[] {"hit"};
		mostCommonWords(s,banned);

	}
	
	
	class Solution {
	    public String mostCommonWord(String paragraph, String[] banned) {
	        HashSet<String> hset = new HashSet<>(Arrays.asList(banned));
	        HashMap<String, Integer> hmap = new HashMap<>();
	        String []para = paragraph.split("[ .,'&?!:;$%()\\-\"]+");
	        for(String word:para) {
	        	if(hmap.containsKey(word.toLowerCase())) {
	        		hmap.put(word.toLowerCase(), hmap.get(word.toLowerCase())+1);
	        	}else {
	        		if(!hset.contains(word.toLowerCase()))
	        			hmap.put(word.toLowerCase(), 1);
	        	}
	        }
	        LinkedList<Map.Entry<String,Integer>> llist = new LinkedList<>(hmap.entrySet());
	        Collections.sort(llist, new Comparator<Map.Entry<String, Integer>>(){
	        	
	        	public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
	        		return o2.getValue().compareTo(o1.getValue());
	        	}
	        	
	        	
	        });
	        
	        //System.out.println(llist.toString());
	        Iterator it = llist.iterator();
	        int max_freq = Integer.MIN_VALUE;
	        ArrayList<String> final_result = new ArrayList<String>();
	        while(it.hasNext()) {
	        	Map.Entry<String, Integer> pair = (Map.Entry<String, Integer>) it.next();
	        	if(pair.getValue() >= max_freq) {
	        		max_freq = pair.getValue();
	        		final_result.add(pair.getKey());
	        	}else {
	        		break;
	        	}
	        	
	        }
	        Collections.sort(final_result);
	        //System.out.println(final_result);
	        
	        
	        return final_result.get(0);
	        
	        
	    }
	}

}
