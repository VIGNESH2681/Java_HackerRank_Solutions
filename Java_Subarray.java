import java.util.Scanner;
public class Java_Subarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        // Count negative subarrays
        int count = countNegativeSubarrays(n, A);

        // Print the result
        System.out.println("The number of subarrays of A having negative sums: " + count);
    }

    public static int countNegativeSubarrays(int n, int[] A) {
        int count = 0;

        for (int start = 0; start < n; start++) {
            int subarraySum = 0;
            for (int end = start; end < n; end++) {
                subarraySum += A[end];
                if (subarraySum < 0) {
                    count += 1;
                }
            }
        }

        return count;
    }
}
