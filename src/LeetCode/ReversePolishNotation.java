package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ReversePolishNotation {
	
	public int reversePolish(String[] tokens) {
		HashMap<String, String> opr = new HashMap<>();
		opr.put("+", "plus");
		opr.put("-","minus");
		opr.put("*", "multiply");
		opr.put("/","divide");
		//String[] opr = new String[] {"+","-","/","*"};
		//List<String> oprs = Arrays.asList(opr);
		List<String> polishList = new ArrayList<>(Arrays.asList(tokens));
		if(tokens.length < 2) {
			return Integer.parseInt(tokens[0]);
		}
		int count = 0;
		while(polishList.size() >1) {
			if(opr.containsKey(polishList.get(count))) {
				int op2 = Integer.parseInt(polishList.remove(count -1));
				int op1 = Integer.parseInt(polishList.remove(count -2));
				String operator = polishList.get(count-2);
				String funcname = opr.get(operator);				
				String result = Integer.toString(funcName(funcname, op1, op2));
				count -= 2;
				polishList.set(count, result);
			}
			count++;
		}
		System.out.println(Integer.parseInt(polishList.get(count-1)));
		return Integer.parseInt(polishList.get(count-1));
	}
	
	public int funcName(String funcname, int  x, int  y){
		if(funcname == "plus"){
			return x + y;	
		}
		else if(funcname == "minus") {
			return x - y;
		}
		else if(funcname == "divide") {
			return x / y;
		}
		else  {
			return x * y;
		}
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  			*["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
		 */
		
		String[] polishArr = new String[] {"18"};
		new ReversePolishNotation().reversePolish(polishArr);

	}

}
