package queue;

import java.util.NoSuchElementException;

public class Dequeue {
	ListNode front;
	ListNode rear;
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
	
	public void enqueue(int value) {
		ListNode newNode = new ListNode(value);
		
		if(isEmpty()) {
			front = newNode;
		}
		else {
			rear.next = newNode;
		}
		rear = newNode;
		length++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		int result = front.data;
		front = front.next;
		return result;
	}
	
	public void print() {
		if(isEmpty()) {
			return;
		}
		
		ListNode current = front;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null"+"\n");
	}
	
	public static void main(String[] args) {
		Dequeue d = new Dequeue();
		
		d.enqueue(1);
		d.enqueue(2);
		d.enqueue(3);
		d.enqueue(4);
		
		d.print();
		
		d.dequeue();
		
		d.print();
	}
}
