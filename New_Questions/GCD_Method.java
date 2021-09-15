package New_Questions;
import java.math.*;

import java.math.BigInteger;
public class GCD_Method
{
    public static void main(String[] args)
    {
//----------------------------------------------------------------------------------------------------------------------
       //Alternate Method----Easy
       int gcd = new BigInteger("10").gcd(new BigInteger("5")).intValue();
       System.out.println("GCD using one Line : "+gcd);







//----------------------------------------------------------------------------------------------------------------------
        //Alternate Method.
        BigInteger a=new BigInteger("10");
        BigInteger b=new BigInteger("5");
        BigInteger c;
        int r;

        c=a.gcd(b);
        System.out.println("GCD id : "+c);

        r=Integer.parseInt(c.toString());
        System.out.println("int GCD id : "+r);
//----------------------------------------------------------------------------------------------------------------------
    }
}

