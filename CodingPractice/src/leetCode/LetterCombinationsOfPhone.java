package leetCode;

import java.util.*;
/**
 * 17
 * @author chinmaysingh
 *
 */

public class LetterCombinationsOfPhone {
	
	public static List<String> combination(ArrayList<ArrayList<Character>> alphabets){
        List<String> result = new ArrayList<>();
        
        for(ArrayList<Character> mlist:alphabets){
            if(result.size() == 0){
                for(Character c:mlist){
                    result.add(c.toString());
                }
                
            }else {
	            List<String> part_result = new ArrayList<>();
	            for(Character c:mlist){
	                for(String s: result){
	                    part_result.add(s+c.toString());
	                }
	                    
	            }
	            result = part_result;
            } 
        }
        System.out.println(result);
        
        return result;
    }
	
	public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        ArrayList<ArrayList<Character>> alphabet = new ArrayList<>();
        for(int i=0; i<digits.length();i++){
            ArrayList<Character> alpha = new ArrayList<>();
            int num = Character.getNumericValue(digits.charAt(i));
            if(num >1 && num <10){
                if(num < 7 && num >1){
                int value = 97 +(num -2)*3;
                for(int count = 0;count<3;count++){
                    alpha.add((char)(value+count));
                }
                
            }else if(num ==7 || num == 9){
                int value = 97 +(num -2)*3;
                if(num ==9) value +=1;
                for(int count = 0;count<4;count++){
                    alpha.add((char)(value+count));
                }
            }else {
            	int value = 97 +(num -2)*3 +1;
                for(int count = 0;count<3;count++){
                    alpha.add((char)(value+count));
                }
            }
            alphabet.add(alpha);
            }else{
            	alpha.add('*');
                alphabet.add(alpha);
            }
        }
        
        System.out.println(alphabet.toString());
        result = combination(alphabet);
        
        return result;
            
    }

	
	public static List<String> searchFIFO(String digits) {
		LinkedList<String> ans = new LinkedList<String>();
		if(digits.isEmpty()) return ans;
		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ans.add("");
		for(int i =0; i<digits.length();i++){
			int x = Character.getNumericValue(digits.charAt(i));
			while(ans.peek().length()==i){
				String t = ans.remove();
				for(char s : mapping[x].toCharArray())
					ans.add(t+s);
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		//letterCombinations("212");
		char[][] dict = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' }, { 'm', 'n', 'o' },
				{ 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };
		searchFIFO("212");

	}

}
