package singly_linked_list;



public class DetectStartOfLoop {
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
	
	public ListNode detectLoop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if(slowPtr==fastPtr) {
				return getStartingOfLoop(slowPtr);
			}
		}
		return null;
	}
	
	public ListNode getStartingOfLoop(ListNode slowPtr) {
		ListNode temp = head;
		while(slowPtr!=temp) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		return slowPtr;
	}
	
	public static void main(String[] args) {
		DetectStartOfLoop ds = new DetectStartOfLoop();
		ds.createLinkedList();
		System.out.println("starting of loop is: "+ds.detectLoop().data);

	}

}
