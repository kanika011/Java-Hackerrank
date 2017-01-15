/*
The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. Your task is to find what the day is on that date.

Input Format

A single line of input containing the space separated month, day and year, respectively, in   format.

Constraints

Output Format

Output the correct day in capital letters.

Sample Input

08 05 2015
Sample Output

WEDNESDAY
Explanation

The day on August th  was WEDNESDAY.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Calendar;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String days = in.next();
        String year = in.next();
        String input_date=days+"/"+month+"/"+year;
        try
        {
            Date d=new SimpleDateFormat("dd/MM/yyyy").parse(input_date);
            Calendar c = Calendar.getInstance();
        c.setTime(d);
        int day = c.get(Calendar.DAY_OF_WEEK);
            if(day == 1)
                {
                System.out.printf("SUNDAY");
            }
            else if(day == 2)
                {
                System.out.printf("MONDAY");
            }
                    else if(day == 3)
                {
                System.out.printf("TUESDAY");
            }            else if(day == 4)
                {
                System.out.printf("WEDNESDAY");
            }            else if(day == 5)
                {
                System.out.printf("THURSDAY");
            }            else if(day == 6)
                {
                System.out.printf("FRIDAY");
            }            else if(day == 7)
                {
                System.out.printf("SATURDAY");
            }            
        }
        catch(Exception e)
        {
            System.out.printf("Not Possible");
        }
        
        
    }
}
