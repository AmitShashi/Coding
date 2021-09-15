package Revision_Questions;
import java.util.Map;                          //Must add this import to avoid error.
import java.util.HashMap;                      //Must add this import to avoid error.
public class Question1_Map
{
    public static void main(String[] args)
    {
        //hackerrank question count total no of pair of socks available to sell.
        //Important map question
        //answer = 3;

        /*---Important Map Terms---

        HashMap<Integer, Integer> map = new HashMap<>();        //Initialize Map
        map.containsKey(x);                                     //Check if key is present or not
        map.put(x,1);                                           //used to add item
        map.get(x);                                             //used to get item
        map.values();                                           //Its an array of map values
        System.out.println(map);                                //print map with key value pair

        map.remove(x);                                          //Used to remove item
        map.clear();                                            //Used to all remove items
        map.size();                                             //find no of items

         */

        int[] stocks = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : stocks)
        {
            if (map.containsKey(x))
            {
                map.put(x, map.get(x) + 1);
            }
            else
            {
                map.put(x, 1);
            }
        }
        System.out.println(map);
        int count = 0;
        for (int x : map.values())
        {
            if(x % 2 == 0)
            {
                count = count + x;
            }
            else
            {
                count = count + x - 1;
            }
            System.out.println("x = " + x+"    count = "+count);
        }
        //Another Method for Loop Through Map
        /*
        for (Map.Entry entry : map.entrySet())
        {
            if((int)entry.getValue() % 2 == 0)
            {
                count = count + (int)entry.getValue();
            }
            else
            {
                count = count + (int)entry.getValue() - 1;
            }
            System.out.println("entry.getValue " + entry.getValue()+"   count "+count);
        }
        */

        System.out.println("Answer : " + count/2);
    }
}