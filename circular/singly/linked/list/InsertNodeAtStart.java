package circular.singly.linked.list;

public class InsertNodeAtStart {
	ListNode last;
	int length;
	
	class ListNode{
		int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data = data;	
		}
	}
	
	public void display() {
		ListNode first = last.next;
		
		while(first!= last) {
			System.out.print(first.data +"-->");
			first = first.next;
		}
		System.out.print(first.data+" "+"\n");
	}
	

	public void insert(int value) {
		ListNode newNode = new ListNode(value);
		
		if(last==null) {
			last = newNode;
			last.next = last;
		}
		else {
			newNode.next = last.next;
			last.next = newNode;
		}
		length++;
	}
	
	public static  void main(String[] args) {
		InsertNodeAtStart ins = new InsertNodeAtStart();
		ins.insert(1);
		ins.insert(2);
		ins.insert(3);
		ins.insert(4);
		ins.insert(5);
		
		ins.display();
	}
}
