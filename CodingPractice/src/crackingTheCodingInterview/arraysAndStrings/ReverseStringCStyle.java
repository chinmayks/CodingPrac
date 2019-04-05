package crackingTheCodingInterview.arraysAndStrings;

import java.util.Arrays;

public class ReverseStringCStyle {
	
	public String reverse(String str) {
		System.out.println(str.length());
		int i = 0;
		int j = str.length()-1;
		char[] arr = new char[str.length()];
		
		while(i != j && j>i) {
			char left = str.charAt(i);
			char right = str.charAt(j);
			arr[i] = right;
			arr[j] = left;
			i++;
			j--;
			
		}
		if((str.length()-1)%2 == 0) {
			arr[i] = str.charAt(i);
		}
		
		return Arrays.toString(arr);
	}

	public static void main(String[] args) {
		ReverseStringCStyle obj = new ReverseStringCStyle();
		System.out.println(obj.reverse("arrays\n"));
		

	}

}
