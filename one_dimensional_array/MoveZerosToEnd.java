package one_dimensional_array;

public class MoveZerosToEnd {
	
	public void move(int[] arr) {
		int j=0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]!=0 && arr[j]==0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
			if(arr[j]!=0) {
				j++;
			}
		}
		
		for(int i = 0; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		MoveZerosToEnd m = new MoveZerosToEnd();
		m.move(new int[] {0,1,0,4,12});
	}
}
