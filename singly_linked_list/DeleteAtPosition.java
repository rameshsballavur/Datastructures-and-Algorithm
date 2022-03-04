package singly_linked_list;

public class DeleteAtPosition {
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
		newNode.next=head;
		head = newNode;
	}
	
	public void display() {
		ListNode temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.print("null"+"\n");
	}
	
	public ListNode delete(int position) {
		if(position==1) {
			head = head.next;
			return head;
		}
		ListNode previous = head;
		int count =1;
		while(count<position-1) {
			previous = previous.next;
			count++;
		}
		ListNode current = previous.next;
		previous.next = current.next;
		return current;
	}
	
	public static void main(String[] args) {
		DeleteAtPosition d = new DeleteAtPosition();
		d.insert(10);
		d.insert(1);
		d.insert(8);
		d.insert(11);
		d.display();
		System.out.println("deleted node is: "+d.delete(3).data);
		d.display();
		
	}
}
