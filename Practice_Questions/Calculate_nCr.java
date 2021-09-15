package Practice_Questions;
import java.util.Scanner;
//combination
public class Calculate_nCr{

        static int nCr(int n, int r)
        {
            return fact(n) / (   fact(r) * fact(n - r)   );
        }
        static int fact(int n)
        {
            int res = 1;
            for (int i = 2; i <= n; i++)
                res = res * i;
            return res;
        }
        public static void main(String[] args) {
            System.out.println("enter value n and r for : nCr");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int r = scan.nextInt();
            System.out.println(nCr(n, r));
        }
    }
