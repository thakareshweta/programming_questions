import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean isPalindrome = true;
        /* Enter your code here. Print output to STDOUT. */
        //if 1st is same as last 
        // if 2nd is same as sencond last and so on..  madam 
        //madam
        // maam
        char[] charArray = A.toCharArray();
        int start = 0;
        int end = charArray.length-1;
        while(start<=end) {
            System.out.println("Start is :" + start);
            System.out.println("end is :" + end);
            if(charArray[start]!=charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        
        if(isPalindrome) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
        
    }
}
