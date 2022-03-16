package queue;

public class Enqueue {
	ListNode front;
	ListNode rear;
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
	
	public void enqueue(int value) {
		ListNode newNode = new ListNode(value);
		
		if(isEmpty()) {
			front = newNode;
		}
		else {
			rear.next = newNode;
		}
		rear = newNode;
		length++;
	}
	
	public void print() {
		if(isEmpty()) {
			return;
		}
		
		ListNode current = front;
		
		while(current!=null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null"+"\n");
	}
	
	
	public static void main(String[] args) {
		Enqueue e = new Enqueue();
		e.enqueue(1);
		e.enqueue(2);
		e.enqueue(3);
		e.enqueue(4);
		
		e.print();
		
	}
}
