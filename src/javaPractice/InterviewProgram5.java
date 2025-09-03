package javaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewProgram5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2=Arrays.asList(4,5,6,7,8,9);
		
		Stream<Integer> fullList=Stream.concat(list1.stream(), list2.stream());
		
	List<Integer> allElements=fullList.collect(Collectors.toList());
	
	System.out.print(allElements);
	}

	
	
	
}
