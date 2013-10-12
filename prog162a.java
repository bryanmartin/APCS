/**
Program: Prog162d - Small Factorials
Version: 1.0

Author: Bryan Martin
Date: 10/9/2013

Compiler/Platform: Java 1.7, Windows 7

Description: This program calculates the factorial of a user inputted number.

What I learned: I learned how to nest FOR loops and just more about loops in general.

Difficulties: I had huge problems with this program. At first, I couldn't figure out how to do this at all, 
and then I realized that I was way overthinking it and it turned out to be fairly simple.
*/

import java.io.*;
import java.util.*;

public class prog162a
{
    public static void main (String [] args)
    {
        System.out.println(System.getProperty("user.dir"));
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number [zero to quit]: ");
        int number = keyboard.nextInt();
        long product = 1;
        long x = 1;
        
        for (product = 1; number != 0; product = 1)
            {
                for (x = 1; x <= number; x++)
                    {
                        product = x * product;                   
                    }
                    
                System.out.println("The value of " + number + "! is " + product);
                System.out.print("\nEnter a number [zero to quit]: ");
                number = keyboard.nextInt();
            }
        }
    }

/**

Enter a number [zero to quit]: 6
The value of 6! is 720

Enter a number [zero to quit]: 9
The value of 9! is 362880

Enter a number [zero to quit]: 12
The value of 12! is 479001600

Enter a number [zero to quit]: 14
The value of 14! is 87178291200

Enter a number [zero to quit]: 0

 */