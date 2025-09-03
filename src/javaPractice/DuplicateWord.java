package javaPractice;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string ="Big black bug bit a big black dog on the big black nose ";
		
		int count;
		//Converts the string  into lowerCase
		string=string.toLowerCase();
		
		//split the string into words 
		String [] words=string.split(" ");
		
		System.out.println("Duplicate words in a given String");
		for(int i=0;i<words.length;i++) {
			count=1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j]="0";
				}
			}
			//Displays the duplicate word if count is greater than 1
			if(count >1 && words[i] !="0")
				System.out.println(words[i]);
		}
		
	}

}
