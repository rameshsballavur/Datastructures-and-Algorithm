package singly_linked_list;

public class InsertAtPosition {
	
	ListNode head;
	
	static class ListNode{
		int data;
		ListNode next;
		
		public ListNode (int data) {
			this.data = data;
		}
	}
	
	public void insert(int value) {
		ListNode newNode = new ListNode(value);
		if(head==null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void display() {
		ListNode current = head;
		
		while(current !=null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null"+"\n");
	}
	
	public void atPosition(int value , int position) {
		ListNode node = new ListNode(value);
		
		if(position==1) {
			node.next = head;
			head=node;
		}
		else {
			ListNode previous = head;
			int count=1;
			
			while(count<position-1) {
				previous = previous.next;
				count++;
			}
			
			ListNode temp = previous.next;
			previous.next = node;
			node.next = temp;
		}
		
		
	}
	
	public static void main(String[] args) {
		InsertAtPosition ip = new InsertAtPosition();
		ip.insert(10);
		ip.insert(8);
		ip.insert(1);
		ip.insert(11);
		
		ip.display();
		ip.atPosition(44,3);
		ip.display();
	}
}
