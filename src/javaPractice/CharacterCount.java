package javaPractice;

import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {
		// Define the input String
		String input="example string";
		
		//Create a HashMap to hold character counts
		HashMap<Character,Integer> charCounts=new HashMap<>();
		
		//Convert the input String to a char array
		char[]  characters=input.toCharArray();
		
		for(char ch:characters) {
			charCounts.put(ch, charCounts.getOrDefault(ch,0)+1);
		}
		
		System.out.println("Character Counts");
		for(HashMap.Entry<Character,Integer> entry:charCounts.entrySet()) {
			System.out.println(entry.getKey() +": "+entry.getValue());
		}

	}

}
