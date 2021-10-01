package String_Manipultion;

public class Reverse_Words_Of_Sentense {
	
	/*  input: my name is harsh"
	 * 
	 * output: ym eman si hsrah
	 */

	public static void main(String[] args) {
		String s="my name is harsh";
		String Sp[]= s.split(" ");
		String rev="";
		String revnew=" ";
		

		for(int i=0;i<=Sp.length-1;i++)
		{
			rev=Sp[i]+" ";
		
			
			for(int j=rev.length()-1;j>=0;j--)
			{
				revnew= revnew+rev.charAt(j);
			}
			
		}
		
		System.out.print("String is ---"+revnew);	
			
		

	}

}
