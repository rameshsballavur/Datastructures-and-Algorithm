package circular.singly.linked.list;

public class InsertNodeAtEnd {
	ListNode last;
	int length;
	
	class ListNode {
		int data ;
		ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public void insert(int value) {
		ListNode newNode = new ListNode(value);
		
		if(last==null) {
			last=newNode;
			last.next = last;
		}
		else {
			newNode.next = last.next;
			last.next = newNode;
			
			last = newNode;
		}
		length++;
	}
	
	public void display() {
		ListNode first = last.next;
		
		while(first!=last) {
			System.out.print(first.data+"-->");
			first = first.next;
		}
		System.out.print(first.data+" "+"\n");
	}
	
	public static void main(String[] args) {
		InsertNodeAtEnd ie = new InsertNodeAtEnd();
		ie.insert(1);
		ie.insert(2);
		ie.insert(3);
		ie.insert(4);
		
		ie.display();
	}
}
