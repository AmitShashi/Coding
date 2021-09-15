package Revision_Questions;

import java.util.Scanner;

public class power_using_recursion
{
    static int pow(int a,int n)
    {
        if(n==1)
            return a;
        return a*pow(a,n-1);
    }
    public static void main(String args[])
    {
        System.out.println("enter two number: a^n");
        Scanner scan = new Scanner(System.in);
        int a= 3;
        int n= 2;
        System.out.println(pow(a,n));
    }
}