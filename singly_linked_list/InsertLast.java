package singly_linked_list;

public class InsertLast {
	ListNode head;
	
	static class ListNode{
		int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public void display() {
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.data +"-->");
			current = current.next;
		}
		System.out.print("null");
	}
	
	public int length() {
		int count =0;
		ListNode current = head;
		while(current!=null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void insertAtEnd(int value) {
		ListNode newNode = new ListNode(value);
		ListNode current =head;
		
		if(head == null) {
		head = newNode;
		return;
		}
		while(current.next!=null) {
			current = current.next;
		}
		current.next=newNode;
	}
	
	public static void main(String[] args) {
		InsertLast il = new InsertLast();
		il.insertAtEnd(10);
		il.insertAtEnd(5);
		il.insertAtEnd(20);
		il.insertAtEnd(50);
		il.insertAtEnd(30);
		il.display();
		System.out.println("length is : "+il.length());
	}
}
 