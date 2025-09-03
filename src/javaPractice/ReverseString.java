package javaPractice;

public class ReverseString {

	public static String reverseString(String str) {
		StringBuilder sb=new StringBuilder();
		for(int i=str.length()-1 ;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="java Guides";
		String reversed=reverseString(input);
		System.out.println("Reversed String -> " +reversed);
	}

}
