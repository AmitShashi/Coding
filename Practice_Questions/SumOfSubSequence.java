package Practice_Questions;

public class SumOfSubSequence {
    // Return sum of sum of all sub-sequence.
    static int sum(int arr[], int n)
    {
        int ans = 0;

        // Finding sum of the array.
        for (int i = 0; i < n; i++)
            ans += arr[i];

        return ans * (int)(Math.pow(2, n - 1));
    }

    // Driver Code
    public static void main(String args[])
    {
        int arr[]= { 6, 7, 8 };
        int n = arr.length;

        System.out.println(sum(arr, n));
    }
}