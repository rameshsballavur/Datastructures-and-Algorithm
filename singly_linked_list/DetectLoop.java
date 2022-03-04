package singly_linked_list;

public class DetectLoop {
	ListNode head;
	
	static class ListNode{
		int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public void createLinkedList() {
		ListNode first = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		ListNode fifth = new ListNode(20);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = third;
	}
	
	public boolean detect() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while(fastPtr!=null && fastPtr.next!=null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(fastPtr==slowPtr) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		DetectLoop d = new DetectLoop();
		d.createLinkedList();
		System.out.println(d.detect());
	}
}
