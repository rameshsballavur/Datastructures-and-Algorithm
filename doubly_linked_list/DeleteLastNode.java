package doubly_linked_list;

import java.util.NoSuchElementException;

public class DeleteLastNode {
	ListNode head;
	ListNode tail;
	int length;
	
	class ListNode {
		int data;
		ListNode next;
		ListNode previous;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public boolean isEmpty() {
		return length == 0; 
	}
	public void insert(int value) {
		ListNode newNode = new ListNode(value);
		
		if(isEmpty()) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
		}
		length++;
	}
	
	public ListNode deleteLast() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		ListNode temp = tail;
		if(head ==tail) {
			tail = null;
			length--;
			return head;
		}
		else {
			tail.previous.next = null;
			tail = tail.previous;
			temp.previous = null;
		}
		length--;
		return temp;
		
	}
	
	public void display() {
		
	}
}
