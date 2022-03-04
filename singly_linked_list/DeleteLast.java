package singly_linked_list;

public class DeleteLast {
	ListNode head;
	
	static class ListNode{
		int data ;
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
		
		newNode.next=head;
		head=newNode;
	}
	public void display() {
		ListNode current = head;
		
		while(current!=null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null"+"\n");
	}
	
	public ListNode delete() {
		if(head==null) {
			return null;
		}
		
		ListNode current = head;
		ListNode previous=null;
		while(current.next!=null) {
			previous = current;
			current = current.next;
		}
		previous.next=null;
		return current;
	}
	public static void main(String[] args) {
		DeleteLast d = new DeleteLast();
		d.insert(10);
		d.insert(1);
		d.insert(8);
		d.insert(11);
		d.display();
		System.out.println("deleted node is : "+d.delete().data);
		d.display();
	}
}
