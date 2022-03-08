package stack;

import java.util.Stack;

public class ValidParanthesis {

	public boolean isValid(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		char[] chars = s.toCharArray();
		
		for(char c : chars) {
			if(c =='(' || c =='{' || c == '[') {
				stack.push(c);
			}
			else {
				if(stack.isEmpty()) {
					return true;
				}
				else {
					char top = stack.peek();
					
					if((c == '}' &&  top == '{')|| (c == ']' && top =='[')  || (c == ')' && top == '('))
					{
						stack.pop();
					}
					else {
						return false;
					}
				}
			}
		}
		
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		ValidParanthesis v = new ValidParanthesis();
		System.out.println(v.isValid("({[]})"));
		System.out.println(v.isValid("[{}]"));
		System.out.println(v.isValid("({[]))"));
	}
}
