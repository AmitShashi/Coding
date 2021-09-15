package Revision_Questions;
import com.sun.jdi.VoidType;

import java.util.*;
import java.util.regex.*;
/*
Question: Write a program to check the regular expression matching. Hint : "+" indicates consecutive multiple occurrence of that particular character.
Case 1
        Input (stdin)                   Output (stdout)
        a+b+c                           Matched
        aaabbc
Case 2
        Input (stdin)                   Output (stdout)
        b+c+x                           Not Matched
        bbcxxz
 */
//--------------------------------------------------------------------------------------------------------------------------------------------------------
public class RegularExpression
{
    public static void main(String[] args)
    {
        String s1,s2,s3,s4,s5,s6="";
        Scanner scan = new Scanner(System.in);
        System.out.println("enter regular expression");
        String regex1 = scan.nextLine();
        String str1 = scan.nextLine();
        String regex2 = scan.nextLine();
        String str2 = scan.nextLine();

        System.out.println("------------------------------");
        System.out.println("Regex1: "+regex1);
        System.out.println("Str1: "+str1);
        System.out.println("Regex2: "+regex2);
        System.out.println("Str2: "+str2);
        System.out.println("------------------------------");

//-----------------------------------------------------------------------------------------------------------
        //alternate method 1 without regex
        if (str1.matches(regex1))
        {
            System.out.println("R1: Match");
             s1="R1: Match";
        }
        else
        {
            System.out.println("R1: Not Match");
             s1="R1: Not Match";
        }
        if (str2.matches(regex2))
        {
            System.out.println("R2: Match");
             s2="R2: Match";
        }
        else
        {
            System.out.println("R2: Not Match");
             s2="R2: Not Match";
        }
//-----------------------------------------------------------------------------------------------------------
        //alternate method 2 with regex
        System.out.println("R1: "+Pattern.matches(regex1,str1));
         s3="R1: "+Pattern.matches(regex1,str1);
        System.out.println("R2: "+Pattern.matches(regex2,str2));
         s4="R2: "+Pattern.matches(regex2,str2);
//-----------------------------------------------------------------------------------------------------------

        Pattern p1 = Pattern.compile(regex1, Pattern.CASE_INSENSITIVE);
        Matcher m1 = p1.matcher(str1);
        //boolean matchFound1 = m1.find();
        if(m1.matches())                        //matches() and find() gives different result.
        {
            System.out.println("R1: Yes");
             s5="R1: Yes";
        } else
        {
            System.out.println("R1: No");
             s5="R1: No";
        }
        //--------------------------------------------------------
        Pattern p2 = Pattern.compile(regex2, Pattern.CASE_INSENSITIVE);
        Matcher m2 = p2.matcher(str2);
        //boolean matchFound2 = m2.find();
        if(m2.matches())                        //matches() and find() gives different result. //find() don't work in some cases
        {
           System.out.println("R2: Yes");
            s6="R2: Yes";
        } else
        {
            System.out.println("R2: No");
             s6="R2: No";
        }
        System.out.println("--------------------------------");
        System.out.println(s1);
        System.out.println(s3);
        System.out.println(s5);
        System.out.println(s2);
        System.out.println(s4);
        System.out.println(s6);
        System.out.println("--------------------------------");
//-----------------------------------------------------------------------------------------------------------

/*
Input for coping...

a+b+c
aaabbc
b+c+x
bbcxxz


//----------------------------------------------------------------------------------------------------------
    Points to Remember for Regex:
    --------------------
    import java.util.*;
    import java.util.regex.*;          //{must import regex because its not in util.*; but in util.regex.*;}
    --------------------

    Boolean flag = str.matches(regex);                                      {Best Method because no regex import needed}

    OR

    Boolean flag = Pattern.matches(regex,str);                              {Best Regex method but need import}

    OR

    Pattern p = Pattern.compile(regex);                                      //{It is same as second method -> but not always gives correct answer}
    Matcher m = p.matcher(str);
    Boolean flag = m.matches();

    OR

    boolean flag = Pattern.compile(regex).matcher(str).matches();            //{It is same as second method but not tested yet}

//----------------------------------------------------------------------------------------------------------
*/
    }
}