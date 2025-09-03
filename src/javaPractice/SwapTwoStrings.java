package javaPractice;

public class SwapTwoStrings {
	
	public static void main(String [] args) {
		String s1="java";
		String s2="guides";
		
		System.out.println("Before swapping two strings:");
		System.out.println("s1 =>" +s1);
		System.out.println("s2 =>" +s2);
		
		String temp;
		temp=s1;
		s1=s2;
		s2=temp;
		
		System.out.println("After swapping two strings:");
		System.out.println("s1 =>"+s1);
		System.out.println("s2 =>"+s2);
		

	}

}
