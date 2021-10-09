/**
 * 
 */
package String_Manipultion;

/**
 * @author Harsh
 * Java Program to count the total number of characters in a string
 * 
 * STEP 1: START
STEP 2: DEFINE String string = "The best of both worlds".
STEP 3: SET count =0.
STEP 4: SET i=0. REPEAT STEP 5 to STEP 6 UNTIL i<string.length
STEP 5: IF (string.charAt(i)!= ' ') then count =count +1.
STEP 6: i=i+1
STEP 7: PRINT count.
STEP 8: END
 *
 */
public class CountCharacter {

	public static void main(String[] args) {
		String str ="The best of both worlds";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
			
		}
	    System.out.println("Total number of characters in a string: " + count);    
	}

}
