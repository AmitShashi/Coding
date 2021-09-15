package New_Questions;
import java.lang.*;    //Important import

public class StringBuilderExample
{
    static String joinWords1(String[] words)       //Bad Way hence...   //Time Complexity is O(n2).     //Because: 1 + 2 + ... + n equals n(n+1)/2, or O(n2)
    {
        String sentence = "";
        for (String w: words)
        {
            sentence = sentence + w;
        }
        return sentence;
    }

    static String joinWords2(String[] words)       //Good Way hence...      //Time Complexity is O(n)
    {
        StringBuilder sentence = new StringBuilder();
        for (String w : words)
        {
             sentence.append(w);
        }
        return sentence.toString();
    }

    public static void main(String[] args)
    {
        String[] words={"hi, ","how ","are ","you ","amit."};

        String s1 = joinWords1(words); //note: must use static keyword in joinWords1 function or this line will give error.
        String s2 = joinWords2(words); //note: must use static keyword in joinWords2 function or this line will give error.

        System.out.println(s1);
        System.out.println(s1);
    }
}
