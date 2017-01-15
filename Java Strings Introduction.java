/*
"A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." — Wikipedia: String (computer science)
This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output: 
For the first line, sum the lengths of  and . 
For the second line, write Yes if  is lexicographically larger than  or No if it is not. 
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

Sample Input

hello
java
Sample Output

9
No
Hello Java
Explanation

String  is "hello" and  is "java".

 has a length of , and  has a length of ; the sum of their lengths is . 
When sorted alphabetically/lexicographically, "hello" comes before "java"; therefore,  is not larger than  and the answer is No.

When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".
*/

import java.io.*;
import java.util.*;
import java.lang.Object;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int size=A.length()+B.length();
        int lex = A.compareTo(B);
        String s=A+" "+B;
        String[] tokens = s.split("\\s");
        String toBeCapped = "";

for(int i = 0; i < tokens.length; i++){
    char capLetter = Character.toUpperCase(tokens[i].charAt(0));
    toBeCapped +=  " " + capLetter + tokens[i].substring(1);
}
toBeCapped = toBeCapped.trim();
         sc.close();
        System.out.printf("%d",size);
        if(lex >0)
            System.out.printf("\nYes");
        else
        {System.out.printf("\nNo");}
        System.out.printf("\n%s",toBeCapped);
        
        
    }
}
