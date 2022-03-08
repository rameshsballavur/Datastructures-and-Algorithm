package one_dimensional_array;

public class ReverseAnArray {
	
	public void reverse(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end]  = temp;
			start++;
			end--;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		ReverseAnArray r = new ReverseAnArray();
		r.reverse(new int[] {2,11,5,10,7,8});
	}
}
