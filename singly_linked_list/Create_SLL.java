package singly_linked_list;

public class Create_SLL {
	ListNode head;
	
	static class ListNode {
		int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public int length() {
		if(head==null)
			return 0;
		ListNode current = head;
		int count = 0;
		while(current!=null) {
			current =current.next;
			count++;
		}
		return count;
	}
	
	public void display() {
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null"+"\n");
	}
	
	public static void main(String[] args) {
		Create_SLL cs = new Create_SLL();
		cs.head = new ListNode(10);
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(11);
		
		cs.head.next = first;
		first.next = second;
		second.next = third;
		third.next = null;
		
		cs.display();
		System.out.println("length is : "+cs.length());
		
		
	}
}
