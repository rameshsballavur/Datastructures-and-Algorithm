package queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumber {
	
	public String[] generate(int n) {
	
	String[] result = new String[n];
	Queue<String> q = new LinkedList<String>();
	
	q.offer("1");
	
	for(int i=0;i<n;i++) {
		result[i] = q.poll();
		
		String n1 = result[i]+"0";
		String n2 = result[i]+"1";
		
		q.offer(n1);
		q.offer(n2);
	}
	
	return result;
	
	}
	public static void main(String[] args) {
		GenerateBinaryNumber g = new GenerateBinaryNumber();
		String[] s = g.generate(5);
		
		for(int i =0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
	}
}
