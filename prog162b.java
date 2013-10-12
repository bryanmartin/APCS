/**
Program: Prog162b - Population Growth
Version: 1.0

Author: Bryan Martin
Date: 10/11/2013

Compiler/Platform: Java 1.7, Windows 7

Description: This program calculates the year it will take to double a population.

What I learned: I learned more about loops.

Difficulties: I had year++ in the syntax of the FOR loop instead of inside the loop, which causes it to be one year.
*/

public class prog162b
{
    public static void main (String [] args)
    {
    	System.out.println("Growth Rate 2.9% annually");
    	System.out.println("Year\tPopulation (in millions)");
    	
    	final double rate = 1.029;
        double popu = 236;
        int year = 1990;
        double endPop;
        
        for (endPop = popu; endPop <= popu * 2; year=year)
            {   
            	year++;
                endPop = endPop * rate;
                System.out.println(year + "\t" + (int) endPop);
            }        
     	System.out.println("\nThe population will double by the year " + year);
    }
}

/**

Growth Rate 2.9% annually
Year	Population (in millions)
1991	242
1992	249
1993	257
1994	264
1995	272
1996	280
1997	288
1998	296
1999	305
2000	314
2001	323
2002	332
2003	342
2004	352
2005	362
2006	372
2007	383
2008	394
2009	406
2010	418
2011	430
2012	442
2013	455
2014	468
2015	482

The population will double by the year 2015

 */