package doubly_linked_list;

public class InsertAtBeginning {
	ListNode head ;
	ListNode tail;
	int length ;
	
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
			head = newNode;
			length++;
			return;
		}
		newNode.next = head;
		head.previous = newNode;
		head = newNode;
		length++;
	}
	
	public void display() {
		ListNode temp = head;
		while(temp!=null){
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.print("null"+"\n");
	}
	
	public static void main(String[] args) {
		InsertAtBeginning ib = new InsertAtBeginning();
		ib.insert(2);
		ib.insert(4);
		ib.insert(6);
		ib.insert(8);
		ib.display();
	}
}
