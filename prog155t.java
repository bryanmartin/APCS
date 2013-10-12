/**
Program: Prog155t - Finding Sum and Average
Version: 1.0

Author: Bryan Martin
Date: 10/10/2013

Compiler/Platform: Java 1.7, Windows 7

Description: This program reads an external file by printing the numbers until it reaches 0,
and then it calculates the sum, amount of numbers, and average.

What I learned: I learned about reading external files.

Difficulties: None.
*/

import java.io.*;
import java.util.*;

public class prog155t
{
    public static void main (String [] args)
    {
        System.out.println("Scores");
        
        Scanner inFile = null;
        try
        {
                inFile = new Scanner (new File("ints.dat"));
            }
        catch   (FileNotFoundException e)
        {
                System.out.println("File not found!");
                System.exit (0);
            }
            
        int sum = 0;
        int amount = 0;
        
        int num = inFile.nextInt();
        while(num != 0)
        {
            System.out.println(num);
            sum+=num;
            amount++;
            num = inFile.nextInt();
        }
        inFile.close();
        
        double avg = (double) sum / amount;
        
        System.out.println("The sum of the numbers = " + sum);
        System.out.println("The number of scores = " + amount);
        System.out.println("The average of the numbers = " + avg);
    }
}

/**

Scores
3
8
1
13
18
15
7
17
1
14
The sum of the numbers = 97
The number of scores = 10
The average of the numbers = 9.7

 */