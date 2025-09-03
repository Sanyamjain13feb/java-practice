package javaPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number=Arrays.asList(10,20,35,50,65,75);
		int result=number.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();
		System.out.println(result);
	}

}
