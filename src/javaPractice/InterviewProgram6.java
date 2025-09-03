package javaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList=Arrays.asList(5,3,4,1,3,7,2,9,9,4);
		
		List<String> strList=Arrays.asList("Amanda","Rob","Sunny","Amanda");
		
	Map<Integer,Long> output=	numList.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	output.forEach((key,value)->{
		System.out.println(key+"-"+value);
	});
	
	Map<String,Long> output1=strList.stream()
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	
	output1.forEach((key,value)->{
		System.out.println(key +" - "+value);
	});
	}

}
