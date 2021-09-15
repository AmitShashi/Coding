package Practice_Questions;
import java.util.*;
//print all subsequence of string.

public class PrintAllSubsequence {

    static List<String> al = new ArrayList<>();
    private static void findsubsequences(String s, String ans)
    {
        if (s.length() == 0)
        {
            al.add(ans);
            return;
        }
        findsubsequences(s.substring(1), ans + s.charAt(0));
        findsubsequences(s.substring(1), ans);
    }
    public static void main(String[] args)
    {
        String s = "abcd";
        findsubsequences(s, ""); // Calling a function
        System.out.println(al);
    }
}