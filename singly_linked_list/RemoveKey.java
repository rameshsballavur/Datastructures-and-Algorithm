package singly_linked_list;

public class RemoveKey {
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
	
	public void display() {
		ListNode current = head;
		
		while(current!=null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null"+"\n");
	}
	
	public void remove(int key) {
		if(head==null) {
		return;
	}
	
	ListNode current = head;
	ListNode temp = null;
	
	if(current!=null && current.data==key) {
		head = current.next;
	}
	temp=current;
	
	while(current!=null && current.data!=key) {
		temp = current;
		current = current.next;
	}
	temp.next = current.next;
}
	public static void main(String[] args) {
		RemoveKey rk = new RemoveKey();
		rk.insert(10);
		rk.insert(1);
		rk.insert(8);
		rk.insert(11);
		rk.insert(20);
		
		rk.display();
		
		rk.remove(10);
		
		rk.display();
	}
}
