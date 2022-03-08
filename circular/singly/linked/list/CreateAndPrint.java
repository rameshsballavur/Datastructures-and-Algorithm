package circular.singly.linked.list;

public class CreateAndPrint {
	ListNode last;
	int length;
	
	class ListNode{
		int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public void createCircularList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode (3);
		ListNode fourth = new ListNode(4);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		last = fourth;
	}
	
	
	public void display() {
		if(last == null) {
			return;
		}
		
		ListNode first = last.next;
		
		while(first!=last) {
			System.out.print(first.data+"-->");
			first = first.next;
		}
		System.out.print(first.data+" "+"\n");
	}
	
	public static void main(String[] args) {
		CreateAndPrint cp = new CreateAndPrint();
		cp.createCircularList();
		cp.display();
	}
}
