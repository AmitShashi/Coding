package Practice_Questions;

import java.util.Scanner;

public class PascalsTriangle {
    static int fact(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    static void ncr(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j = 0; j <=i; j++)
            {
               System.out.print(" "+fact(i)/((fact(i-j)*fact(j))) + "  ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("enter no of rows for pascals triangle");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ncr(n);

    }
}
