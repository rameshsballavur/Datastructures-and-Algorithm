package circular.singly.linked.list;

import java.util.NoSuchElementException;

public class RemoveFirstNode {
	ListNode last;
	int length;
	
	class ListNode{
		int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	public void insert(int value) {
		ListNode newNode = new ListNode(value);
		if(last==null) {
			last = newNode;
			last.next = last;
		}
		else {
			newNode.next = last.next;
			last.next = newNode;
		}
		length++;
	}
	
	public boolean isEmpty() {
		return length ==0;
	}
	public ListNode delete() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		ListNode first = last.next;
		if(last == first) {
			last=null;
		}
		else {
			last.next = first.next;
			first.next = null;
		}
		length--;
		return first;
	}
	
	public void display() {
		ListNode first = last.next;
		
		while(first!=last) {
			System.out.print(first.data+"-->");
			first = first.next;
		}
		System.out.print(first.data+" "+"\n");
	}
	
	public static void main(String[] args) {
		RemoveFirstNode r = new RemoveFirstNode();
		r.insert(1);
		r.insert(2);
		r.insert(3);
		r.insert(4);
		
		r.display();
		System.out.println("Deleted node is: "+r.delete().data);
		r.display();
	}
}
