package one_dimensional_array;

public class ResizeAnArray {
	
	public void resize(int[] arr, int capacity) {
		int[] temp = new int[capacity];
		
		System.out.println("old array size: "+arr.length);
		for(int i = 0; i<arr.length;i++) {
			temp[i] = arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		arr = temp;
		
		System.out.println("new array size: "+arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	
	}
	
	public static void main(String[] args) {
		ResizeAnArray r = new ResizeAnArray();
		r.resize(new int[] {5,9,3,10} , 10);
	}
}
