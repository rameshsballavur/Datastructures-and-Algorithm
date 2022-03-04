package singly_linked_list;

public class ReverserList {
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
			head = newNode;
			return;
		}
		
		ListNode current = head;
		
		while(current.next!=null) {
			current = current.next;
		}
		current.next=newNode;
	}
	
	public ListNode reverse() {
		
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while(current!=null) {
			next =current.next;
			current.next = previous;
			previous = current ;
			current = next;
		}
		return previous;
	}
	
	public static void main(String[] args) {
		ReverserList rl = new ReverserList();
		rl.insert(10);
		rl.insert(1);
		rl.insert(8);
		rl.insert(11);
		rl.display();
		rl.reverse();
		rl.display();
	}
}
