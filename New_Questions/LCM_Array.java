package New_Questions;
import java.util.Arrays;
public class LCM_Array
{
        private static int gcd(int a, int b)
        {
            if(b == 0)  return a;
            return gcd(b, a%b);
        }
        public static void main(String args[])
        {
            int[] arr= {2,3,6,8};
            int total_lcm=1;
            for(int each : arr)
            {
                total_lcm = (total_lcm*each)/gcd(total_lcm,each);
            }
            System.out.println("LCM for "+Arrays.toString(arr)+" is : "+total_lcm);
        }
}

//----------------------------------------------------------------------------------------------------------------------
//Method - 2
/*
   class Main
   {
        public static int findGCD(int a, int b)
        {
            if(b == 0)
                return a;
            return findGCD(b, a%b);
        }
   public static void main(String[] args)
   {
    int array[] = {8, 4, 2, 16};

    int lcm = array[0];
    int gcd = array[0];

    for(int i=1; i<array.length; i++)
    {
      gcd = findGCD(array[i], lcm);
      lcm = (lcm*array[i])/gcd;
    }
    System.out.println("LCM: "+lcm);
  }
}
*/
//----------------------------------------------------------------------------------------------------------------------