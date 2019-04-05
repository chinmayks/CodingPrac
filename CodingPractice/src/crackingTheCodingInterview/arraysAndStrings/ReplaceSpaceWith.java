package crackingTheCodingInterview.arraysAndStrings;

public class ReplaceSpaceWith {
	
	public static void replaceSpace(String s) {
		int space = ' ';
		StringBuffer sbf = new StringBuffer();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == space) {
				sbf.append("%20");
			}
			else {
				sbf.append(s.charAt(i));
			}
		}
		System.out.println(sbf);
		
	}

	public static void main(String[] args) {
		replaceSpace("my name is chinmay");

	}

}
