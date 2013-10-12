/**
Program: Prog152a - From 3 to 9669
Version: 1.0

Author: Bryan Martin
Date: 10/4/2013

Compiler/Platform: Java 1.7, Windows 7

Description: This program calculates the some of all of the multiples of three up to 9669.

What I learned: I learned more about FOR.

Difficulties: None.
*/

public class prog152a
{
    public static void main(String args[])
    {       
        int sum = 0;
        for (int x = 3; x < 9670; x+=3)
            {   
                sum+=x;
            }
        System.out.println("The sum of the multiples of 3, from 3 to 9669 is " + sum);
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