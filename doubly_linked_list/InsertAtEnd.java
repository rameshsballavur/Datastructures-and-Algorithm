package doubly_linked_list;

public class InsertAtEnd {
	ListNode head;
	ListNode tail;
	int length;
	
	class ListNode{
		int data;
		ListNode next;
		ListNode previous;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public void insert(int value) {
		ListNode newNode = new ListNode(value);
		
		if(isEmpty()) {
			tail= newNode;
			head = newNode;
		}
		else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			
		}
		length++;
	}
	
	public void displayForward() {
		ListNode current = head;
		
		
		while(current!=null) {
			
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null"+"\n");
	}
	
	public void displayBackward() {
		ListNode current = tail;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current = current.previous;
		}
		System.out.print("null"+"\n");
	}
	
	public static void main(String[] args) {
		InsertAtEnd ie = new InsertAtEnd();
		ie.insert(10);
		ie.insert(8);
		ie.insert(1);
		ie.insert(11);
		ie.displayForward();
		ie.displayBackward();
	}
}
