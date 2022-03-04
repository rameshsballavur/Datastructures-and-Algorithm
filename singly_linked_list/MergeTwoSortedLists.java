package singly_linked_list;

public class MergeTwoSortedLists {
	ListNode head;
	
	static class ListNode{
		int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public void insertList1(int value) {
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
	
	public void insertList2(int value) {
		ListNode newNode = new ListNode(value);
		
		if(head == null) {
			head=newNode;
			return;
		}
		
		ListNode current = head;
		
		while(current.next!=null) {
			current = current.next;
		}
		current.next=newNode;
	}
	
	public void display() {
		ListNode current = head;
		
		while(current!= null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null"+"\n");
	}
	
	public ListNode merge(ListNode a, ListNode b) {
		
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		
		while(a!=null && b!=null) {
			if(a.data<=b.data) {
				tail.next = a;
				a = a.next;
			}
			else {
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}
		
		if(a==null) {
			tail.next = b;
		}
		else {
			tail.next = a;
		}
		
		return dummy.next;
	}
	
	public static void main(String[] args) {
		MergeTwoSortedLists mts1 = new MergeTwoSortedLists();
		mts1.insertList1(2);
		mts1.insertList1(4);
		mts1.insertList1(6);
		
		System.out.println("first List: ");
		mts1.display();
		
		MergeTwoSortedLists mts2 = new MergeTwoSortedLists();
		mts2.insertList2(1);
		mts2.insertList2(3);
		mts2.insertList2(5);
		mts2.insertList2(7);
		
		System.out.println("second List: ");
		mts2.display();
		
		
		mts2.head = mts2.merge(mts1.head, mts2.head); //this can also be done...
		
		System.out.println("Merged List: ");
		mts2.display();
		
//		MergeTwoSortedLists mts3 = new MergeTwoSortedLists();
//		mts3.head = mts3.merge(mts1.head, mts2.head);
//		System.out.println("Merged list: ");
//		mts3.display();
		
	}
}
