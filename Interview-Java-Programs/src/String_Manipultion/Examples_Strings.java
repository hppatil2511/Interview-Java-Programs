package String_Manipultion;

public class Examples_Strings {

	public static void main(String[] args) {
	
		String greet ="Hello is world";
		
		int length =greet.length();
		
		System.out.println(length);
		
		String first="Java";
		String second="Programming";
		String third ="Java";
		
		String joinedstring =first.concat(second);
		
		System.out.println(joinedstring);
		
		
		boolean result1= first.equals(second);
		System.out.println(result1);
		
		boolean result2= first.equals(third);
		System.out.println(result2);

		first=first.concat("world");
		
		
		System.out.println(first);
	}

}
