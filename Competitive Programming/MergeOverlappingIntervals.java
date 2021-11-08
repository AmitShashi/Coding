/********************************************************************************************************************************************************************
Question Name: Merge Intervals (Leetcode)
-------------------------------------------------------------------------------------------------
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
and return an array of the non-overlapping intervals that cover all the intervals in the input.
-------------------------------------------------------------------------------------------------
Example 1:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
-------------------------------------------------------------------------------------------------
Example 2:
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
-------------------------------------------------------------------------------------------------
********************************************************************************************************************************************************************/
import java.util.Arrays;
import java.util.LinkedList;

class Solution //very very easy
{
    public static int[][] merge(int[][] intervals) 
    {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) 
        {
            //if linked list is empty or (if arr interval begin is greater than linked list last digit) then add interval
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) 
            {
                merged.add(interval);
            }
            else 
            {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]); //else if overlap then extend to larger value.
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
  
    public static void main(String[] args) //driver code
    {
        int[][] arr= {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(arr)));
    }
}
