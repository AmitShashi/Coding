package New_Questions;
import java.util.*;
public class NoOfCarries
{
    public static int numberOfCarries (int num1, int num2)
    {
        int i = 0,carri = 0;
        while (num1 != 0 && num2 != 0)
        {
            int d1 = num1 % 10;     int d2 = num2 % 10;
            num1 = num1 / 10;       num2 = num2 / 10;

            if ((d1 + d2 + carri) > 9)
            {
                i++;
                carri = d1 + d2 + carri;
                carri = carri/10;
            }
        }
        return i;
    }
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int num1 = sc.nextInt ();
        int num2 = sc.nextInt ();
        System.out.println (numberOfCarries (num1, num2));
    }
}