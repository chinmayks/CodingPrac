package HackerRank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.Map.Entry;

class TrieDataStructure {
	
	Map<Character, TrieDataStructure> trienode;
	boolean endOfWord = false;	
	
	
	public TrieDataStructure() {
		trienode = new HashMap<Character, TrieDataStructure>();
		
	}
	public void insert(String word) {
		TrieDataStructure root = this;
        //System.out.println(word);
		
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
			//System.out.println(node.trienode.toString() +" "+ node.endOfWord);
			
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

	

}
public class Contacts_trie {

    /*
     * Complete the contacts function below.
     */
    static int[] contacts(String[][] queries) throws FileNotFoundException, UnsupportedEncodingException {
        /*
         * Write your code here.
         */
    	Scanner sc = new Scanner(System.in);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        TrieDataStructure root = new TrieDataStructure();
        PrintWriter writer = new PrintWriter("resultForTRIE.txt", "UTF-8");
        int count = 1;
        for(int i=0; i<queries.length; i++){
        	//System.out.println(queries[i][0]);
            if(queries[i][0].equalsIgnoreCase("add")){
                    root.insert(queries[i][1]);
                }
            else if(queries[i][0].equalsIgnoreCase("find")){
                writer.println(root.partialSearch(queries[i][1]));
                //root = new TrieDataStructure();
                System.out.println(count++);
            }
           
            
        }
        //System.out.println(queries.length);
        int[] result = new int[temp.size()];
        for(int i=0; i<temp.size(); i++){
            result[i] = temp.get(i);
        }
        
        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Chinmay\\eclipse-workspace\\CodingPrac\\src\\HackerRank\\arguments"));

        int queriesRows = Integer.parseInt(scanner.nextLine().trim());

        String[][] queries = new String[queriesRows][2];

        for (int queriesRowItr = 0; queriesRowItr < queriesRows; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr++) {
                String queriesItem = queriesRowItems[queriesColumnItr];
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }
         //System.out.println("going to tree");
        int[] result = contacts(queries);
        
        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
