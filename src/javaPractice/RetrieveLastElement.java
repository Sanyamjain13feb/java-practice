package javaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RetrieveLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strings=Arrays.asList("Java","Python","C++","JavaScript","Ruby");
		
		//Using Java8 Streams  to retrieve the last element
		
		Optional<String> lastElement=strings.stream()
				.reduce((first,second) ->second);
		
		//Displaying the last name
		lastElement.ifPresent(element -> System.out.println("The last Element is "+element));

	}

}
