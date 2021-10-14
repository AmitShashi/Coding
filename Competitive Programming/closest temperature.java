import java.util.*;
import java.io.*;
import java.math.*;
/*
Link: https://www.codingame.com/ide/puzzle/temperatures:
____________________________________________________________________________________________________
Question:
____________________________________________________________________________________________________
In this exercise, you have to analyze records of temperature to find the closest to zero.
Write a program that prints the temperature closest to 0 among input data. 
If two numbers are equally close to zero, positive integer has to be considered closest to zero 
(for instance, if the temperatures are -5 and 5, then display 5).
Your program must read the data from the standard input and write the result on the standard output.
____________________________________________________________________________________________________
Input
Line 1: N, the number of temperatures to analyze
Line 2: A string with the N temperatures expressed as integers ranging from -273 to 5526
____________________________________________________________________________________________________
Output
Display 0 (zero) if no temperatures are provided. Otherwise, display the temperature closest to 0.
____________________________________________________________________________________________________
Constraints
0 ≤ N < 10000
____________________________________________________________________________________________________
Example: Input
5
1 -2 -8 4 5
Example: Output
1
____________________________________________________________________________________________________
*/
class Solution 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int min=5526;
        boolean negative=true;
        for (int i = 0; i < n; i++)
        {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            if(t>=0)
            {
                negative=false;
            }
            if(Math.abs(t)<Math.abs(min))
            {
                min=t;
                if(Math.abs(t)==Math.abs(min))
                {
                    min=Math.abs(t);
                }
            }
        }
        if(negative==true)
        {
            min=min*(-1);
        }
        // Write an answer using System.out.println()
        if(n==0)
            System.out.println(0);
        else
            System.out.println(min);
    }
}