package String_Manipultion;

import java.util.Scanner;

public class Test_Trim_method {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter city name");
		
		String name = sc.nextLine().toLowerCase().trim();
				
				if(name.equals("pune"))
				{
					System.out.println("namskar");
				}
				else if(name.equals("banglore"))
				{
					System.out.println("namskar blore");
				}
				else if(name.equals("chennai"))
				{
					System.out.println("nasmkara");
				}
				else
				{
					System.out.println("invalid city");
				}
	}

}
