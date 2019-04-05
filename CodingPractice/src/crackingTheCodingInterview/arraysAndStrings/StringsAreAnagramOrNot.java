package crackingTheCodingInterview.arraysAndStrings;

import java.util.HashMap;
public class StringsAreAnagramOrNot {
	
	public static boolean IsAnagram(String s, String n) {
		if(s.length() != n.length()) return false;
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		int uniqueChar = 0;
		for(int i =0; i<s.length(); i++) {
			if(hmap.containsKey(s.charAt(i))) {
				hmap.put(s.charAt(i), hmap.get(s.charAt(i))+1);
			}
			else {
				hmap.put(s.charAt(i), 1);
				uniqueChar++;
			}
		}
		
		for(int i=0; i<n.length();i++) {
			if(hmap.containsKey(n.charAt(i))) {
				hmap.put(n.charAt(i), hmap.get(n.charAt(i))-1);
				if(hmap.get(n.charAt(i)) == 0) {
					uniqueChar--;
				}
			}
			else {
				return false;
			}
		}
		System.out.println();
		if(uniqueChar == 0)
			return true;
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(IsAnagram("biaary", "braany"));

	}

}
