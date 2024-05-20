public class odd_even{
    public static void main(String[] args) {
        // Input array
        int[] numbers = {34,95,215,943,721,326,844,1663,1992,42990,23,95};

        int evenCount = 0;
        int oddCount = 0;

        // Count even and odd numbers
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Display the counts
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}