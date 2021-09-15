package Practice_Questions;
import java.util.Scanner;
//Write a program to print all permutations of a given string
//Note: This solution prints duplicate permutations if there are repeating characters in input string
public class StringPermutation {

    private void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scan.next();
        int n = str.length();
        StringPermutation permutation = new StringPermutation();
        permutation.permute(str, 0, n-1);
    }
}
