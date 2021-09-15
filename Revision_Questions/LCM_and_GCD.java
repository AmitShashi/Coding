package Revision_Questions;
public class LCM_and_GCD
{
     static int lcm(int a, int b)
    {
        return (a * b) / gcd(a, b);
    }

     static int gcd(int a, int b)
     {
         if (a == 0) return b; //is statement end in this line.
         return gcd(b%a, a);//it is similar to else part not if
     }

//----------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args)
    {
        System.out.println("LCM : "+lcm(4,6)+"   GCD : "+gcd(4,6));

        System.out.println("GCD of three numbers : "+gcd(gcd(4,6),8));
        System.out.println("LCM of three numbers : "+lcm(lcm(4,6),8));
        System.out.println("LCM of Array : "+gcd(gcd(4,6),8));
    }
}






//----------------------------------------------------------------------------------------------------------------------
/*
 // Recursive function to return gcd of a and b           //easy to remember.
    static int gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0)
          return b;
        if (b == 0)
          return a;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a%b, b);
        return gcd(a, b%a);
    }
 */
//----------------------------------------------------------------------------------------------------------------------