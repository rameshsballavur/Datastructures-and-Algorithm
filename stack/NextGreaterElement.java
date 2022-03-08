package stack;

import java.util.Stack;

public class NextGreaterElement {
	
	
	public int[] nextGE(int[] arr) {
		
		int[] result = new int[arr.length];
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = arr.length-1; i>=0; i--) {
			
			if(!stack.isEmpty()) {
				while(!stack.isEmpty() && stack.peek()<=arr[i]) {
					stack.pop();
				}
			}
			
			if(stack.isEmpty()) {
				result[i] = -1;
			}
			else {
				result[i]= stack.peek();
			}
			
			stack.push(arr[i]);
		}
		
		return result;
	}
	public static void main(String[] args) {
		NextGreaterElement n = new NextGreaterElement();
		int[] res = n.nextGE(new int[] {4,7,3,4,8,1});
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}
}
