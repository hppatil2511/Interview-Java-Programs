package String_Manipultion;

public class String_Concept {

	public static void main(String[] args) {
		String s = new String("Durga");
		s.concat("Software");
		System.out.println(s);
		
		String s1 = new String("Durga");
		String s2 =s1.concat("Software");//if we create reference variables then we can join the screen
		System.out.println(s2);
		
		StringBuffer sb = new StringBuffer ("Durga");
		sb.append("Software");
		System.out.println(sb);
		
		String t= "DURGA SOFT";
		System.out.println(t.length());
		System.out.println(t.trim().length());
		// 
		String t1 = new String("durga");
		String t2 = t1.toUpperCase();
		String t3 =t1.toLowerCase();
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		
		String a1 ="durga";
		String a2 = a1.toString();
		String a3 = a1.toLowerCase();
		String a4 =a1.toUpperCase();
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		System.out.println(a1==a4);
	} 

}
