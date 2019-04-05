package leetCode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "(])";
		String open = "{([";
		String close = "}])";
		HashMap<Character, Character> hmap = new HashMap<Character, Character>();
		hmap.put(']', '[');
		hmap.put('}', '{');
		hmap.put(')', '(');
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<input.length();i++) {
			//System.out.println(close.indexOf(input.charAt(i)));
			if(open.indexOf(input.charAt(i)) >= 0) {
				stack.push(input.charAt(i));
			}
			else if(close.indexOf(input.charAt(i)) >= 0 && stack.size()>0) {
				if(stack.size()!= 0 && stack.peek() == hmap.get(input.charAt(i))) {
					stack.pop();
				}
				else {
					break;
				}
			}
			else {
				stack.push(input.charAt(i));
			}
		}
		if(stack.size() == 0)System.out.println("valid parenthesis");
		else System.out.println("Invalid parenthesis");
		
	}

}
