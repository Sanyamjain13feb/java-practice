package javaPractice;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers=Arrays.asList(1,2,2,3,4,4,5);
		List<Integer> list =numbers.stream()
		.distinct().toList();
		
	    System.out.println(list);
		
		List<String> numbers1=Arrays.asList("Apple","Banana","Apple","orange","Mango");
		List<String> list1=numbers1.stream().distinct().toList();
		
		System.out.println(list1);
		
	}

}
