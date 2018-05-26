package Algo;
import java.lang.Math;
import java.util.Scanner;

public class BitOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1000,1001,1002,1003,1003,1004};
		//int x=arr[0];
//		for(int i=1; i< arr.length;i++) {
//			String j = Integer.toBinaryString(x);
//			String k = Integer.toBinaryString(arr[i]);
//			System.out.println(j +" "+k );
//			int l = x | arr[i];
//			System.out.println(l +" "+ Integer.toBinaryString(l));
//			x = l;
//			System.out.println(x);
//		}
		//System.out.println(1000^1001^1002^1003^1003^1004);
		//System.out.println(1|2|3|4|5|6);
		//System.out.println(1000|1001|1002|1003|1003|1004);
		//System.out.println(14623 ^ 14623^14623^14623^14623^14623);
		//System.out.println(14623 | 14623|14623|14623|14623|14623);
		
//		long maxval = (long) (Math.pow(2, 32)-1);
//		System.out.println(Integer.toBinaryString((int) maxval));
//		System.out.println(1^ maxval);
//		
//		int[] perm = new int[] {3,2,1,4};
//		Scanner
//		int total = Integer.MIN_VALUE;
//		for(int i=0;i<perm.length-1;i++) {
//			int x = perm[i] ^ perm[i+1];
//			if(x>total) {
//				total = x;
//			}
//		}
//		System.out.println(total);
		int input = 100;
        String x = Integer.toBinaryString(input);
        String result ="";
        for(int i=0; i<x.length();i++){
            if(x.charAt(i) == '0'){
                result += 1;
            }
            else{
                result += 0;
            }
        }
        System.out.println(Integer.parseInt(result,2));
	}

}
