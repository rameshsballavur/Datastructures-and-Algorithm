package singly_linked_list;

public class SearchElement {
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
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null"+"\n");
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
	
	public boolean search(int searchKey) {
		if(head==null) {
			return false;
		}
		
		ListNode current = head;
		while(current!=null) {
			
			if(current.data==searchKey) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	public static void main(String[] args) {
		SearchElement se = new SearchElement();
		se.insert(10);
		se.insert(1);
		se.insert(8);
		se.insert(11);
		se.display();
		System.out.println(se.search(11));
	}
}
