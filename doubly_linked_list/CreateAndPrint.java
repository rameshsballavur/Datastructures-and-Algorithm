package doubly_linked_list;

public class CreateAndPrint {
	ListNode head;
	ListNode tail;
	
	static class ListNode{
		int data;
		ListNode next;
		ListNode previous;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public void createLinkedList() {
		ListNode first = new ListNode(2);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(6);
		ListNode fourth = new ListNode(8);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		
		tail = fourth;
		fourth.previous = third;
		third.previous = second;
		second.previous = first;
	}
	
	public void displayForward() {
		ListNode temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.println("null"+"\n");
	}
	
	public void displayBackward() {
		ListNode temp = tail;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp = temp.previous;
		}
		System.out.print("null"+"\n");
		
	}
	
	public static void main(String[] args) {
		CreateAndPrint cp = new CreateAndPrint();
		cp.createLinkedList();
		cp.displayForward();
		cp.displayBackward();
	}
}
