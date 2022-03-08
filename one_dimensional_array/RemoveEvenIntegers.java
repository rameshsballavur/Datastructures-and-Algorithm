package one_dimensional_array;

public class RemoveEvenIntegers {
	
	public int[] removeEven(int[] arr) {
		
		int count =0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]%2 != 0) {
				count++;
			}
		}
		
		int[] res = new int[count];
		int idx=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 != 0) {
				res[idx] = arr[i];
				idx++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		RemoveEvenIntegers r = new RemoveEvenIntegers();
		int[] arr = r.removeEven(new int[] {3,2,4,7,10,6,5});
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
