package singly_linked_list;

public class InsertAtBeginning {
	ListNode head;
	
	static class ListNode{
		int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public void createList() {
		head = new ListNode(10);
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(9);
		
		head.next = first;
		first.next =second;
		second.next = third;
	}
	
	public void display() {
		
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null"+"\n");
	}
	
	public int length() {
		if(head ==null)
			return 0;
		
		int count = 0;
		ListNode current = head;
		while(current!=null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void insert(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	public static void main(String[] args) {
		InsertAtBeginning ib = new InsertAtBeginning();
		ib.createList();
		ib.display();
		System.out.println("length is : "+ib.length());
		ib.insert(50);
		ib.insert(25);
		ib.insert(11);
		ib.insert(70);
		ib.display();
	}
}
