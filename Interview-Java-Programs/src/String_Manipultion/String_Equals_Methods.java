package String_Manipultion;

public class String_Equals_Methods {

	public static void main(String[] args) {
		
		String s1 = new String("durga");
		String s2 = new String("durga");
		System.out.println(s1==s2);//refernce/address comparison//false 
		System.out.println(s1.equals(s2));//true  

		
		StringBuffer sp1 = new StringBuffer("durga");
		StringBuffer sp2 = new StringBuffer("durga");
		System.out.println(sp1==sp2);//false
		System.out.println(sp1.equals(sp2));//false
	}

} 
