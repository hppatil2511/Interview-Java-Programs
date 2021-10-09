package String_Manipultion;

public class ShortWordinSenstense {

public static void main(String[] args) {
		
		// create a string
		String example = "myq name is w harshvardhan";
		
		String [] words = example.split(" ");
		String shortestWord =words[0];
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length() <shortestWord.length())
			{
				shortestWord =words[i];
			}
			
		}
		System.out.println(shortestWord);

	}

	
	
}
