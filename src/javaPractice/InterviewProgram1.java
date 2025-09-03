package javaPractice;

import java.util.Arrays;
import java.util.List;

public class InterviewProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings=Arrays.asList("ab","aba","xyx","mno","xyz","pop");
		
		strings.stream().filter(x->x.length() >0 && x.endsWith(String.valueOf(x.charAt(0))))
		.forEach(System.out::println);

	}

}
