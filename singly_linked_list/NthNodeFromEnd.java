package singly_linked_list;

public class NthNodeFromEnd {
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
		
		if(head == null) {
			head = newNode;
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
		
		while(current!=null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null"+"\n");
	}
	
	public ListNode nthNode(int n) {
		if(head==null) {
			return null;
		}
		
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count =0;
		
		while(count<n) {
			refPtr = refPtr.next;
			count++;
		}
		
		while(refPtr!=null) {
			mainPtr = mainPtr.next;
			refPtr = refPtr.next;
		}
		
		return mainPtr;
	}
	public static void main(String[] args) {
		NthNodeFromEnd n = new NthNodeFromEnd();
		n.insert(10);
		n.insert(1);
		n.insert(8);
		n.insert(11);
		n.insert(15);
		n.display();
		System.out.println("the nth node from end of list is : "+n.nthNode(2).data);
	}
}
