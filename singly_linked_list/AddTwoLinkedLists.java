package singly_linked_list;

public class AddTwoLinkedLists {
	ListNode head;
	
	static class ListNode{
		int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data =data;
		}
	}
	
	public void firstLinkedList() {
		ListNode first = new ListNode(7);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(9);
		
		head = first;
		first.next = second;
		second.next = third;
	}
	
	public void secondLinkedList() {
		ListNode first = new ListNode(5);
		ListNode second = new ListNode(6);
		
		head = first;
		first.next =second;
	}
	
	public void display() {
		ListNode current = head;
		
		while(current!=null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null"+"\n");
	}
	
	public ListNode addLists(ListNode a, ListNode b) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		int carry=0;
		while(a!=null || b!=null) {
			int X = (a!=null) ? a.data:0;
			int Y = (b!=null) ? b.data:0;
			
			int sum = carry+X+Y;
			
			carry = sum/10;
			
			tail.next = new ListNode(sum%10);
			tail = tail.next;
			
			if(a!=null) a = a.next;
			if(b!=null) b = b.next;
			
			
		}
		
		if(carry>0) {
			tail.next = new ListNode(carry);
		}
		return dummy.next;
	}
	
	public static void main(String[] args) {
		AddTwoLinkedLists a1 = new AddTwoLinkedLists();
		a1.firstLinkedList();
		a1.display();
		
		AddTwoLinkedLists a2 = new AddTwoLinkedLists();
		a2.secondLinkedList();
		a2.display();
		
		AddTwoLinkedLists a3 = new AddTwoLinkedLists();
		a3.head = a3.addLists(a1.head, a2.head);
		a3.display();
	}
}
