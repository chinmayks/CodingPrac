package crackingTheCodingInterview.bitManip;

public class bitManipSubstr {

	public static void main(String[] args) {
		Long n = 10000000000L;
		int m = 10101;
		int i=2, j=6;
		int max = ~0;
		int left = max - ((1 << j)-1);
		
		int right = (1 << i) - 1;
		/*System.out.println(Integer.toBinaryString(left));
		System.out.println(Integer.toBinaryString(right));
		int mask = left | right;
		System.out.println(Integer.toBinaryString(mask));
		System.out.println(Integer.toBinaryString(~0));*/
		//System.out.println((n & mask) | (m << i));
		System.out.println(Integer.parseInt("1010") | Integer.parseInt("1011"));
		int x = 11|1;
		System.out.println(1010 | 1011);

	}

}
