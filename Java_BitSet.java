import java.io.*;
import java.util.*;
public class Java_BitSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read N and M
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            // Initialize BitSets
            BitSet B1 = new BitSet(N);
            BitSet B2 = new BitSet(N);

            // Consume the remaining newline character
            scanner.nextLine();

            // Perform M operations
            for (int i = 0; i < M; i++) {
                String operation = scanner.next();
                int set = scanner.nextInt();
                int index;

                switch (operation) {
                    case "AND":
                        if (set == 1) {
                            B1.and(B2);
                        } else {
                            B2.and(B1);
                        }
                        break;
                    case "OR":
                        if (set == 1) {
                            B1.or(B2);
                        } else {
                            B2.or(B1);
                        }
                        break;
                    case "XOR":
                        if (set == 1) {
                            B1.xor(B2);
                        } else {
                            B2.xor(B1);
                        }
                        break;
                    case "FLIP":
                        index = scanner.nextInt();
                        if (set == 1) {
                            B1.flip(index);
                        } else {
                            B2.flip(index);
                        }
                        break;
                    case "SET":
                        index = scanner.nextInt();
                        if (set == 1) {
                            B1.set(index);
                        } else {
                            B2.set(index);
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operation: " + operation);
                }

                // Print the number of set bits in B1 and B2
                System.out.println(B1.cardinality() + " " + B2.cardinality());

                // Consume the remaining newline character if it exists
                if (scanner.hasNextLine()) {
                    scanner.nextLine();
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Input format is incorrect. Please provide valid integers.");
        } finally {
            scanner.close();
        }
    }
}
