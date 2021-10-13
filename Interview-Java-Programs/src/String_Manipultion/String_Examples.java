package String_Manipultion;

public class String_Examples {

	public static void main(String[] args) {
		String s1= new String("You cannot change me");
		String s2= new String("You cannot change me");
		System.out.println(s1==s2);//False differnt objects
		
		String s3= "You cannot change me";
		System.out.println(s1==s3);//false differnt objects
		
		String s4= "You cannot change me";
		System.out.println(s3==s4);//true same object
		
		String s5= "You cannot "+"change me";
		System.out.println(s4==s5);//true ,same object at compile time
		
		String s6= "You cannot ";
		String s7 =s6+"change me";
		System.out.println(s6==s7);//false
		
		final String s8 ="You cannot ";//performed at runtime
		
		String s9 =s8+"change me";
		System.out.println(s8==s9);//true
	}

}
