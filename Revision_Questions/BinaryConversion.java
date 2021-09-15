package Revision_Questions;
import java.util.Scanner;

//Shortcut:-         System.out.println(Integer.toString(num,2));                  //one line program.
//or                 System.out.println(Integer.toBinaryString(num));              //one line program.

//Best Program
class BinaryConversion
{
    static int binary(int n)
    {
        if (n == 0)
            return 0;
        else
            return (n % 2 + 10 * binary(n / 2));
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter decimal");
        int n = scan.nextInt();
        System.out.println(binary(n));
    }
}
/*
-----------------------------------------------------------------------------------------------------
                                              Explanation
-----------------------------------------------------------------------------------------------------
formula:           remainder+10*(recursive_quotient)
-----------------------------------------------------------------------------------------------------
                                                    1*2^2     +     1*2^1     +      0*2^0
                                                       5      +        1      +         0
-----------------------------------------------------------------------------------------------------
binary(6);    ---> 110 (Answer)
if (n == 0)     return 0;
else            return (n % 2 + 10 * binary(n/2));    ---------110
                          |     |         |
                          0  +  10  *   b(3)
                                          |
                              (n % 2 + 10 * binary(n/2));  --------11
                                 |      |        |
                                 1  +   10  *   b(1)
                                                  |
                                      (n % 2 + 10 * binary(n/2));   -------1
                                         |      |        |
                                         1  +   10   *  b(0)
                                                         |
                                                         0
----------------------------------------------------------------------------------------------------------
 */