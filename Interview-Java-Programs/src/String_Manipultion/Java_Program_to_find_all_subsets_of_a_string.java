package String_Manipultion;
/*
 * In this program, all the subsets of the string need to be printed. The subset of a string is the character or the group of characters that are present inside the string.

All the possible subsets for a string will be n(n+1)/2.

For example, all possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.
 STEP 1: START
STEP 2: DEFINE string str = "FUN"
STEP 3: DEFINE len = str.length()
STEP 4: SET temp =0
STEP 5: DEFINE String array having length: len*(len + 1)/2
STEP 6: SET i =0. REPEAT STEP 7 to STEP 11 UNTIL i<len
STEP 7: SET j =1. REPEAT STEP 8 to STEP 10 UNTIL j<len
STEP 8: arr[temp] = str.substring(i, j+1)
STEP 9: temp = temp + 1
STEP 10: j =j + 1
STEP 11: i =i +1
STEP 12: PRINT ("All subsets for given string are: ")
STEP 13: SET i = 0
STEP 14: REPEAT STEP 14 UNTIL i<arr.length
STEP 14: PRINT arr[i]
STEP 15: END
 */
public class Java_Program_to_find_all_subsets_of_a_string {
    public static void main(String[] args) {  
	String str = "FUN";  
    int len = str.length();  
    int temp = 0;  
    //Total possible subsets for string of size n is n*(n+1)/2  
    String arr[] = new String[len*(len+1)/2];  

    //This loop maintains the starting character  
    for(int i = 0; i < len; i++) {  
        //This loop adds the next character every iteration for the subset to form and add it to the array  
        for(int j = i; j < len; j++) {  
            arr[temp] = str.substring(i, j+1);  
            temp++;  
        }  
    }  

    //This loop prints all the subsets formed from the string.  
    System.out.println("All subsets for given string are: ");  
    for(int i = 0; i < arr.length; i++) {  
        System.out.println(arr[i]);  
    }  
}  
	
	
	
}
