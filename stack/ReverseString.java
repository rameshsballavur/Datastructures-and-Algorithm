package stack;

import java.util.Stack;

public class ReverseString {
	
	public String reverse(String str) {
		
		Stack<Character> stack = new Stack<>();
		char[] c = str.toCharArray();
		
		for(char chars : c) {
			stack.push(chars);
		}
		for(int i=0;i<str.length();i++) {
			c[i] = stack.pop();
		}
		
		return new String(c);
	}
	
	public static void main(String[] args) {
		ReverseString r = new ReverseString();
		String str =r.reverse("Hello");
		System.out.println(str);
	}
}
