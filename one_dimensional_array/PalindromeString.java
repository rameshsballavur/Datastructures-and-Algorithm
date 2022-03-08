package one_dimensional_array;

public class PalindromeString {
	
	public boolean isPalindrome(String word) {
		char[] arr = word.toCharArray();
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			if(arr[start] != arr[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		PalindromeString p = new PalindromeString();
		System.out.println(p.isPalindrome("gadag"));
	}
}
