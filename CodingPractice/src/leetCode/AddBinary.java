package leetCode;
import java.util.*;

public class AddBinary {
	public static String addBinary(String a, String b) {
        int len = a.length() >= b.length()? a.length(): b.length();
        StringBuilder sb = new StringBuilder();
        if(len > a.length()){
            int l1 = a.length();
            for(int i=0; i<len-l1;i++){
                a = 0+a;
            }
        }else if(len > b.length()){
            int l2 = b.length();
            for(int i=0; i<len-l2;i++){
                b = 0+b;
            }
        }
        //System.out.println(len+" "+a +"  "+b);
        int carry = 0;
        for(int i=len-1; i>=0; i--){
            int x = Character.getNumericValue(a.charAt(i));
            int y = Character.getNumericValue(b.charAt(i));
            if(x ==1 && y==1){
                sb.insert(0,0 | carry);
                carry = 1;
            }else{
                if((x|y) ==1 && carry ==1){
                	sb.insert(0,0);
                    carry = 1;
                }else{
                	sb.insert(0,x|y|carry);
                    carry = 0;
                }
            }
        }
        if(carry > 0) return sb.insert(0,carry).toString();
        return sb.toString();
    }

	public static void main(String[] args) {
		System.out.println(addBinary("11111", "1"));

	}

}
