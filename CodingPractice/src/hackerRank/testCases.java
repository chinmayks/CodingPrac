package hackerRank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class testCases {
	
	static String gameOfThrones(String s){
        // Complete this function
        
		// TODO Auto-generated method stub
		String x = s;
        String status ="";
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for(int i=0; i<x.length();i++){
            if(hashMap.containsKey(x.charAt(i))){
                hashMap.put(x.charAt(i), hashMap.get(x.charAt(i))+1);
            }
            else{
                hashMap.put(x.charAt(i), 1);
            }
        }
        //System.out.println(hashMap.toString());
        Iterator it = hashMap.entrySet().iterator();
        boolean flag = false;
        while(it.hasNext()) {
        	Map.Entry pair = (Map.Entry)it.next();
        	Integer y = (Integer) pair.getValue();
        	if(y%2 == 0) {
        		
        	}
        	else {
        		if(!flag) {
        			flag = true;
        			
        		}
        		else {
        			status = "NO";
        			break;

        		}
        	}
        	if(!it.hasNext()) {
        		status = "YES";
        	}
        }
        return status;
	
    }


	public static void main(String[] args) {
		String result = gameOfThrones("cdcdcdcdeeeef");
        System.out.println(result);
		
	}
	}
