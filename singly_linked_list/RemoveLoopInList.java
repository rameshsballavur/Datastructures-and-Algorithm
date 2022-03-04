package singly_linked_list;


public class RemoveLoopInList {
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
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(20);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next =sixth;
		sixth.next = third;
	}
	
	public void detectLoop() {
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if(slowPtr == fastPtr) {
				removeLoop(slowPtr);
				return;
			}
		}
	}
	
	public void removeLoop(ListNode slowPtr) {
		ListNode temp = head;
		
		while(slowPtr.next!=temp.next) {
			slowPtr=slowPtr.next;
			temp = temp.next;
		}
		slowPtr.next = null;
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
		RemoveLoopInList rm = new RemoveLoopInList();
		rm.createLinkedList();
		rm.detectLoop();
		rm.display();
		
	}
	
}
