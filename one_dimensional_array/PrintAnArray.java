package one_dimensional_array;

public class PrintAnArray {
	public void printArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		PrintAnArray p = new PrintAnArray();
		p.printArray(new int[] {1,2,3,4,5});
	}
}
