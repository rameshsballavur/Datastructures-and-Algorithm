package one_dimensional_array;

public class FindMinVal {
	
	public int minVal(int[] arr) {
		
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		FindMinVal f = new FindMinVal();
		System.out.println( f.minVal(new int[] {6,5,4,3,2,1}));
	}
}
