package javaPractice;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {
	public static void main(String [] args) {
		

		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		numbers.stream()        //convert to list into stream
		.filter(num->num % 2 ==0)   
		.forEach(num->System.out.println(num));
		
		
//		number.stream().filter(num->num%2==0).forEach(System.out::println);
		
	}

}
