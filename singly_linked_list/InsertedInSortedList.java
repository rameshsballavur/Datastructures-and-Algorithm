package singly_linked_list;

public class InsertedInSortedList {
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
		current.next = newNode;
	}
	
	public void display() {
		ListNode current = head;
		
		while(current!=null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null"+"\n");
	}
	
	public void insertElement(int value) {
		ListNode newNode = new ListNode(value);
		
		if(head==null) {
			head=newNode;
			return;
		}
		
		ListNode current = head;
		ListNode temp = null;
		while(current!=null && current.data<newNode.data) {
			temp = current;
			current = current.next;
		}
		newNode.next = current;
		temp.next = newNode;
	}
	
	public static void main(String[] args) {
		InsertedInSortedList is = new InsertedInSortedList();
		is.insert(10);
		is.insert(14);
		is.insert(18);
		is.display();
		is.insertElement(16);
		is.display();
	}
}
