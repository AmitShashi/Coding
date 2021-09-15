package New_Questions;
import java.util.ArrayList;
import java.util.HashMap;
import java.math.*;
//correct this program from gfg
//Question: find length of shortest unique substring;
public class ShortestUniqueSubstring
{
    public static void main(String[] args)
    {
        //String Str="abaaba";      //ans 2
        String Str="zyzyzyz";       //ans 5
        //find all possible substring
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < Str.length(); i++)
        {
            for (int j = i+1; j < Str.length(); j++)
            {
                if(i!=j)
                {
                    arr.add(Str.substring(i,j));
                }
            }

        }
        HashMap<String,Integer> map = new HashMap<>();
        for (String x: arr)
        {
            if(map.containsKey(x))
            {
                map.put(x,map.get(x)+1);
            }
            else
            {
                map.put(x,1);
            }
        }
        int temp=999,min=999;
        for (String x: arr)
        {
            if(map.get(x)==1)
            {
                temp=x.length();
                min=Math.min(min,temp);
            }
        }
        //print out
        System.out.println(arr);
        System.out.println(map);
        System.out.println(min);//It is answer
    }
}