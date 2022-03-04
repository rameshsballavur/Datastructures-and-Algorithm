package singly_linked_list;

public class DeleteFirst {
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
		System.out.print("null"+"\n");
	}
	
	public void insertLast(int value) {
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
	
	public ListNode delete() {
		if(head ==null) {
			return null;
		}
		
		ListNode temp =head;
		head = head.next;
		temp.next=null;
		return temp;
		
	}
	
	public static void main(String[] args) {
		DeleteFirst d = new DeleteFirst();
		d.insertLast(10);
		d.insertLast(1);
		d.insertLast(8);
		d.insertLast(11);
		d.display();
		System.out.println("deleted node is: "+d.delete().data);
		
		d.display();
	}
}
