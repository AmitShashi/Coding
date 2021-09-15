package Revision_Questions;

import java.util.Scanner;
import java.math.*;

public class IsPrime_Func {

    public static void main(String[] args)
    {
        boolean flag;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int n = scan.nextInt();
        BigInteger b = new BigInteger(String.valueOf(n));
        flag=b.isProbablePrime(1);



        System.out.println(flag);
    }

}
