package one_dimensional_array;

public class FindMissingNumber {
	
	public int find(int[] arr) {
		
		int n = arr.length+1;
		
		int sum = n*(n+1)/2;
		
		for(int i = 0;i<arr.length;i++) {
			sum = sum-arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		FindMissingNumber f = new FindMissingNumber();
		System.out.println("the missing number is : " + f.find(new int[] {2,4,1,8,6,3,5}));
	}
}
