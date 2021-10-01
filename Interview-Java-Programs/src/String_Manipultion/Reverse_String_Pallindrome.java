package String_Manipultion;

public class Reverse_String_Pallindrome {

	public static void main(String[] args) {
	
		String s="madam";
		String rev="";
		String n = null;
		n=s;
		

		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		
		}
		
		if(rev.equals(n)) 
		{
		
		System.out.println("String is pallindrome  -->"+rev);	
		}
		else
		{
			System.out.println("String is NOT pallindrome  -->"+rev);
		}
	}

		
		
	}


