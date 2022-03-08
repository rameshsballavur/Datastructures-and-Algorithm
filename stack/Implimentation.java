package stack;

import java.util.EmptyStackException;

public class Implimentation {
	ListNode top;
	int length;
	
	class ListNode{
		int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	public void push(int value) {
		ListNode temp = new ListNode(value);
		temp.next = top;
		top = temp;
		length++;
	}
	
	public int pop() {
		int result = top.data;
		top = top.next;
		return result;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		return top.data;
	}
	
	public static void main(String[] args) {
		Implimentation i = new Implimentation();
		i.push(10);
		i.push(20);
		i.push(30);
		
		System.out.println(i.peek());
		i.pop();
		System.out.println(i.peek());
		i.pop();
		System.out.println(i.peek());
	}
}
