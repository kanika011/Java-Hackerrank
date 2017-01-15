/*
Two strings  and  are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of  is .

Given two strings, print Anagrams if they are anagrams, print Not Anagrams if they are not. The strings may consist at most  English characters; the comparison should NOT be case sensitive.

This exercise will verify that you can sort the characters of a string, or compare frequencies of characters.

Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Sample Input 1

anagramm
marganaa
Sample Output 1:

Not Anagrams
*/

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
    if(a.length() != b.length())
        return false;
        String a2 = a.toUpperCase();
         String b2 = b.toUpperCase();
        char[] a1 = a2.toCharArray();
        char[] b1 = b2.toCharArray();
        
        Arrays.sort(a1);
      Arrays.sort(b1);
        for(int i = 0;i<a.length();i++)
            {
            if (a1[i] != b1[i])
            return false;
        }
        return true;
        
    }
	
	    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}