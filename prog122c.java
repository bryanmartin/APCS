/**
Program: Prog122c - function chart
Version: 1.0

Author: Bryan Martin
Date: 10/4/2013

Compiler/Platform: Java 1.7, Windows 7

Description: This program starts out with the number two and adds two each time until ten. It adds one, multiplies two, and squares the number.

What I learned: I learned more about FOR.

Difficulties: None.
*/

public class prog122c
{
    public static void main(String args[])
    {       
        for (int x = 2; x < 11; x+=2)
            {   
                int num, add, mult, square;
                num = x;
                add = x+1;
                mult = x*2;
                square = (int) Math.pow(x, 2);
                
                System.out.println(num + "\t" + add + "\t" + mult + "\t" + square + "\n");
            }
    }
}

/**

2	3	4	4

4	5	8	16

6	7	12	36

8	9	16	64

10	11	20	100

 */