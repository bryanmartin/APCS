/*
Program: Prog152d - Summing Some Numbers
Version: 1.0

Author: Bryan Martin
Date: 10/8/2013

Compiler/Platform: Java 1.7, Windows 7

Description: This program takes a start and end value, and prints all numbers between (inclusive) along with the sum and average.

What I learned: I learned more about the FOR loop and accumualtion.

Difficulties: I had forgotten to give the variable sum a value before being able to do accumulation.
*/

import java.io.*;
import java.util.*;

public class prog152d
{
    public static void main(String args[])
    {   
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Enter Starting Value: ");
        int start = kbReader.nextInt();
        System.out.print("Enter Ending Value: ");
        int end = kbReader.nextInt();
        System.out.println();
        double sum = 0;
        
        for (int value = start; value <= end; value++)
            {   
                System.out.println(value);
                sum+=value;
            }
        double avg = (sum / (end - start + 1));
        System.out.println("Sum of the numbers " + start + "..." + end + " is " + (int) sum);
        System.out.println("The average of the numbers " + start + "..." + end + " is " + avg);
    }
}

/**

Enter Starting Value: 5
Enter Ending Value: 8

5
6
7
8
Sum of the numbers 5...8 is 26
The average of the numbers 5...8 is 6.5

 */