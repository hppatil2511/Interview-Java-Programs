package String_Manipultion;

public class Short_Long_Word_in_given_String {

	public static void main(String[] args) {
		
		// create a string
		String example = "myq name is w harshvardhan";
		
		String [] words = example.split(" ");
		String shortestWord =words[0];
		String largestWord =words[0];
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length() >shortestWord.length())
			{
				shortestWord =words[i];
			}
			
		}
		System.out.println(shortestWord);
		
		
		for(int j=0;j>words.length;j++)
		{
			if(words[j].length() <largestWord.length())
			{
				largestWord =words[j];
			}
			
		}
		System.out.println(largestWord);

	}

}
