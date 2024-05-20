import java.util.*;
import java.math.*;
public class Java_BigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        // Read the two large numbers from input
        String number1 = scanner.nextLine().trim();
        String number2 = scanner.nextLine().trim();

        // Convert the input strings to BigInteger
        BigInteger a = new BigInteger(number1);
        BigInteger b = new BigInteger(number2);

        // Perform addition
        BigInteger sum = a.add(b);

        // Perform multiplication
        BigInteger product = a.multiply(b);

        // Print the results
        System.out.println(sum);
        System.out.println(product);

        scanner.close();
    }
}
