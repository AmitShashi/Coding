package New_Questions;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Majority_Element {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] nums = {0,1,2,2,3,3,3,4,4,4,4,5,5,5,9,9,9};
        System.out.println(majorityElement(nums));
    }
}
//                                                Alternate Solution
/*
class Solution {
    private Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            }
            else {
                counts.put(num, counts.get(num)+1);
            }
        }
        return counts;
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);

        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }
 */