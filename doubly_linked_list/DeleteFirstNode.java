package doubly_linked_list;

import java.util.NoSuchElementException;

public class DeleteFirstNode {
	private ListNode head;
	private ListNode tail;
	private int length;
	
	class ListNode{
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
			tail = newNode;
		}
		else {
			head.previous = newNode;
			newNode.next = head;
			head=newNode;
		}
		length++;
	}
	
	public void display() {
		
		if(isEmpty()) {
		System.out.println("no elements to display");
			return;
		}
		ListNode temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.print("null"+"\n");
	}
	public ListNode deleteFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		ListNode temp = head;
		
		if(head == tail) {
			tail = null;
			length--;
		
			return head;
		}
		else {
			head.next.previous=null;
			head = head.next;
			temp.next = null;
		}
		length--;
		return temp;
	}
	
	public static void main(String[] args) {
		DeleteFirstNode d = new DeleteFirstNode();
		d.insert(20);
//		d.insert(15);
//		d.insert(4);
//		d.insert(10);
		
		d.display();
		
		System.out.println("deleted node is: "+d.deleteFirst().data);
//		System.out.println("deleted node is: "+d.deleteFirst().data);		
		d.display();
		
		
	
	}
}
