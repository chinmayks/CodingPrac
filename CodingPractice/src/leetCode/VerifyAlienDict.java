package leetCode;
import java.util.*;
/**
 * 953
 * @author chinmaysingh
 *
 */
public class VerifyAlienDict {
	public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> orders = new HashMap<>();
        ArrayList<String> wordlist = new ArrayList<String>();
        for(int i=0; i<order.length();i++){
            orders.put(order.charAt(i), i);
        }
        int maxlen = Integer.MIN_VALUE;
        for(String word :words){
            if(word.length()>maxlen){
                maxlen = word.length();
            }
            wordlist.add(word);
        }
        
        for(int i=0; i<maxlen; i++){
            for(int j=0; j<wordlist.size()-1;j++){
                if(i<wordlist.get(j).length() && i<wordlist.get(j+1).length()){
                    if(orders.get(wordlist.get(j).charAt(i)) < orders.get(wordlist.get(j+1).charAt(i))){
                        if(j==0){
                            wordlist.remove(j);
                        }else if(j+1 == wordlist.size()-1){
                            wordlist.remove(j+1);
                        }else{
                            if(orders.get(wordlist.get(j+1).charAt(i)) < orders.get(wordlist.get(j+2).charAt(i))){
                                wordlist.remove(j+1);
                            }
                        }
                    }
                    else if(orders.get(wordlist.get(j).charAt(i)) == orders.get(wordlist.get(j+1).charAt(i))){
                        
                    }else{
                        return false;
                    }
                }else {
                	if(wordlist.get(j).length() > wordlist.get(j+1).length()) return false;
                }
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
