
public class BubbleSort {
    void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }


    public static void main(String args[]) {
        BubbleSort bubble = new BubbleSort();
        int arr[] = {95,234,625,114012,03210,128,256};
        bubble.bubbleSort(arr);
        System.out.print("Sorted: ");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + "  ");
    }
}
