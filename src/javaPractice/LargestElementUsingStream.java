package javaPractice;

import java.util.Arrays;

public class LargestElementUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {10,20,5,25,15};
		
		int max=Arrays.stream(array).max().getAsInt();
		
		System.out.println("Largest element using streams  " +max);
		
	}

}
