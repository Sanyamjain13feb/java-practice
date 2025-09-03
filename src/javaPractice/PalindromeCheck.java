package javaPractice;

public class PalindromeCheck {

	public static boolean isPalindrome(String str) {
		
		int left=0;
		int right=str.length()-1;
		while(left < right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
	}
			left++;
			right--;
		}
		return  true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="level";
		boolean isPalindrome=isPalindrome(input);
		System.out.println("Is Palindrome :"+isPalindrome);
		
	}	
}
