package Algo.Tree;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @author {Chinmay Singh}
 *
 */

public class TrieDataStructure {
	
	Map<Character, TrieDataStructure> trienode;
	boolean endOfWord = false;	
	
	
	public TrieDataStructure() {
		trienode = new HashMap<Character, TrieDataStructure>();
		
	}
	public void insert(String word) {
		TrieDataStructure root = this;
		
		for(int i=0; i<word.length(); i++) {
			TrieDataStructure node = new TrieDataStructure();
			if( root.trienode.containsKey(word.charAt(i))) {
				node = root.trienode.get(word.charAt(i));
			}
			else {
				root.trienode.put(word.charAt(i), node);
			}
			root = node;
			if(i == word.length()-1) {
				node.endOfWord = true;
			}
		}
		
		
	}
	
	public int partialSearch(String word) {
		TrieDataStructure root = this;
		TrieDataStructure node = null;
		int count = 0;
		for(int i=0; i<word.length(); i++) {
			if(root.trienode.containsKey(word.charAt(i))) {
				root = root.trienode.get(word.charAt(i));
				
			}
			else {
				return 0;
			}
			
		}
		
		return _partialSearch(root, count);
		
		
	}
	
	public int _partialSearch(TrieDataStructure node, int count) {
		if(!node.trienode.isEmpty()) {
			System.out.println(node.trienode.toString() +" "+ node.endOfWord);
			
			Iterator itr = node.trienode.entrySet().iterator();
			while(itr.hasNext()) {
				Map.Entry pair = (Entry) itr.next();
				count = _partialSearch((TrieDataStructure) pair.getValue(), count);
				if(node.endOfWord) {
					count++;
				}
				
			}
		}
		else {
			if(node.endOfWord) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrieDataStructure root = new TrieDataStructure();
		String[] wordlist = new String[] {"hackerrank", "hack", "hac2", "hackerearth", "haden"};
		for(String word: wordlist) {
			root.insert(word);
		}
		
		System.out.println(root.partialSearch("have"));
		
		

	}

}
