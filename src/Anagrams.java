import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Find if two strings are anagrams or not .
 * CAT is an anagram of CAT ACT TAC etc. 
 * 
 */
public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String stringInput1 = scanner.next();
		String stringInput2 = scanner.next();
		
		/* 
		 * 1. Check the length of both the strings if the length is not
		 * same then return false
		 * 2. Convert string into character array 
		 * 3. convert letters to uppercase and calculate ascii value
		 * 4. create an array of 26 integers and store acsii value occurrence in it
		 * 
		 * 
		 */
		
		//System.out.println(isAnagram(stringInput1, stringInput2));
		
		//using maps
		System.out.println(isAnagramUsingMap(stringInput1, stringInput2));
		
		
		

	}

	private static boolean isAnagramUsingMap(String stringInput1, String stringInput2) {
		// TODO Auto-generated method stub
		Map asciiMap = new HashMap();
		stringInput1 = stringInput1.toUpperCase();
		stringInput2 = stringInput2.toUpperCase();
		char[] inputArray1 = stringInput1.toCharArray();
		char[] inputArray2 = stringInput2.toCharArray();
		int asciiValue;
		if(stringInput1.length()!= stringInput2.length()) {
			return false;
		} 
		for(int i=0;i< inputArray1.length; i++) {
			asciiValue = (int) inputArray1[i];
			if(asciiMap.containsKey(asciiValue)) {
				int val = (int) asciiMap.get(asciiValue);
				asciiMap.put(asciiValue ,val+1);
			} else {
				asciiMap.put(asciiValue,1);
			}
		}
		for(int i=0;i< inputArray2.length; i++) {
			asciiValue = (int) inputArray2[i];
			if(asciiMap.containsKey(asciiValue)) {
				int val = (int) asciiMap.get(asciiValue);
				asciiMap.put(asciiValue ,val-1);
			} else {
				return false;
			}
		}
		for (Object val: asciiMap.values()) {
			if((int)val !=0) {
				return false;
			}
		}
		return true;
		
		
	}

	private static boolean isAnagram(String stringInput1, String stringInput2) {
		int [] asciiArray = new int [26];
		int asciiValue;
		stringInput1 = stringInput1.toUpperCase();
		stringInput2 = stringInput2.toUpperCase();
		
		
		char[] inputArray1 = stringInput1.toCharArray();
		char[] inputArray2 = stringInput2.toCharArray();
		
		if(stringInput1.length()!= stringInput2.length()) {
			return false;
		} 
		for(int i=0;i< inputArray1.length; i++) {
			asciiValue = ((int) inputArray1[i])-65;
			asciiArray[asciiValue] = asciiArray[asciiValue] + 1;
		}
		for(int i=0;i< inputArray2.length; i++) {
			asciiValue = ((int) inputArray2[i])-65;
			if(asciiArray[asciiValue] == 0) {
				return false;
			} else {
				asciiArray[asciiValue] = asciiArray[asciiValue] - 1;
			}
		}
		
		for(int i=0 ; i< asciiArray.length;i++) {
			if(asciiArray[i]!=0) {
				return false;
			}
		}
		return true;
		
		
		
	}
	
	

}
