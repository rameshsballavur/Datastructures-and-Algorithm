package singly_linked_list;

public class RemoveDuplicateFromSorted {
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
		
		while(current!= null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null"+"\n");
	}
	
	public void removeDuplicate() {
		ListNode current = head;
		
		while(current!=null && current.next!=null) {
			if(current.data==current.next.data) {
				current.next = current.next.next;
			}
			else {
				current = current.next;
			}
		}
	}
	
	public static void main(String[] args) {
		RemoveDuplicateFromSorted r = new RemoveDuplicateFromSorted();
		r.insert(1);
		r.insert(1);
		r.insert(2);
		r.insert(3);                                                                                
		r.insert(3);
		r.display();
		r.removeDuplicate();
		r.display();
	}
}
