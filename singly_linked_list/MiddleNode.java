package singly_linked_list;

public class MiddleNode {
	ListNode head;
	
	static class ListNode{
		int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public void insert(int value) {
		ListNode newNode = new ListNode(value);
		
		if(head==null) {
			head=newNode;
			return;
		}
		ListNode current = head;
		while(current.next!=null) {
			current = current.next;
		}
		current.next=newNode;
	}
	
	public void display() {
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.data +"-->");
			current = current.next;
		}
		System.out.print("null"+"\n");
	}
	
	public ListNode middle() {
		if(head==null) {
			return null;
		}
		
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		
		return slowPtr;
	}
	public static void main(String[] args) {
		MiddleNode m = new MiddleNode();
		m.insert(10);
		m.insert(1);
		m.insert(8);
		m.insert(11);
		m.insert(15);
		m.insert(2);
		m.insert(7);
		
		m.display();
		
		System.out.println("the middle node is : "+m.middle().data);
	}
}
