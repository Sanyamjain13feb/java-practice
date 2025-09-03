package javaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Remove the  duplicates element of  the array
		List<Integer> list=Arrays.asList(1,2,3,2,1,4,5,4,5,6);
		
	List<Integer> result=	list.stream()
			.distinct().collect(Collectors.toList());
	
	System.out.println(result);

	}

}
