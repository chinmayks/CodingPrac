package crackingTheCodingInterview.arraysAndStrings;

import java.util.Objects;

public class RemoveDuplicateWithoutBuffer {
	
	public static String removeDuplicateCharacters(String word) {
	    Objects.requireNonNull(word);
	    int no = 'a';
	    char a = (char)no;

	    char[] wordArray = word.toCharArray();

	    for (int i = 0; i < wordArray.length; i++) {
	        int count = 0;
	        for (int j = i; j < wordArray.length; j++) {
	            if (wordArray[i] == wordArray[j]) {
	                count++;
	                if (count > 1) {
	                    wordArray[j] = 0;
	                }
	            }
	        }
	    }
	    return String.valueOf(wordArray);
	}

	public static void main(String[] args) {
		//char[] str = new char[] {'a','a','a','b','b'};
		removeDuplicateCharacters("aabb");
	}

}
