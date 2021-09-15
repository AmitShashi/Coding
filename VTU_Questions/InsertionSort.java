package VTU_Questions;
class InsertionSort {
    void sort(int[] arr)
    {
        for (int i = 1; i < arr.length; ++i)
        {
            int key = arr[i];
            int previous_index = i - 1;

            while (previous_index >= 0 && arr[previous_index] > key)
            {
                arr[previous_index + 1] = arr[previous_index];
                previous_index--;
            }
            arr[previous_index + 1] = key;
        }
    }

    // Driver method
    public static void main(String[] args)
    {
        int[] arr = { 12, 11, 13, 7, 0, 99, 3, 5, 1, 4, 8, 6};
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        for (int j : arr)
        {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
