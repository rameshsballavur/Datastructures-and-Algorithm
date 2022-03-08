package one_dimensional_array;

public class SecondMaxVal {
	
	public int Max(int[]arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				secondMax = max;
				max = arr[i];
			}
			else if(arr[i]>secondMax && arr[i]!=max) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}
	public static void main(String[] args) {
		SecondMaxVal s = new SecondMaxVal();
		System.out.println(s.Max(new int[] {12,34,2,34,33,5}));
	}
}
