package String_Manipultion;

/*To check whether the string can be divided into N equal parts, 
we need to divide the length of the string by n and assign the result to variable chars
 Java Program to divide a string in 'N' equal parts.

STEP 1: START
STEP 2: DEFINE str = "aaaabbbbcccc"
STEP 3: DEFINE len
STEP 4: SET n =3
STEP 5: SET temp = 0.
STEP 6: chars = len/n
STEP 7: DEFINE String[] equalstr.
STEP 8: IF (len%n!=0)
then PRINT ("String can't be divided into equal parts")
else go to STEP 9
STEP 9: SET i =0.
STEP 10: REPEAT STEP 11 to STEP 14 UNTIL i<len
STEP 11: DEFINE substring part.
STEP 12: equalstr [temp] = part
STEP 13: temp = temp + 1
STEP 14: i = i + chars
STEP 15: PRINT n
STEP 16: SET i=0. REPEAT STEP 17 to STEP 18 UNTIL i<equalstr.length
STEP 17: PRINT equalstr[i]
STEP 18: i = i + 1
STEP 19: END
*/

public class Divide_String_N_Parts {
	public static void main(String[] args) {  
        String str = "aaaabbbbcccc";  

      //Stores the length of the string  
      int len = str.length();  
      //n determines the variable that divide the string in 'n' equal parts  
      int n = 3;  
      int temp = 0, chars = len/n;  
      //Stores the array of string  
      String[] equalStr = new String [n];  
      //Check whether a string can be divided into n equal parts  
      if(len % n != 0) {  
          System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  
      }  
      else {  
          for(int i = 0; i < len; i = i+chars) {  
              //Dividing string in n equal part using substring()  
              String part = str.substring(i, i+chars);  
              equalStr[temp] = part;  
              temp++;  
          }  
  System.out.println(n + " equal parts of given string are ");  
          for(int i = 0; i < equalStr.length; i++) {  
              System.out.println(equalStr[i]);  
              }  
          }  
      }  
	
	
	
}
