import java.io.*;
import java.util.*;

public class Java_Exception_Handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Reading inputs
            String inputX = sc.next();
            String inputY = sc.next();

            // Attempt to parse inputs to integers
            int x = Integer.parseInt(inputX);
            int y = Integer.parseInt(inputY);

            // Attempt division and print result
            int result = x / y;
            System.out.println(result);

        } catch (NumberFormatException e) {
            // Catching input mismatch (non-integer input)
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            // Catching division by zero
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (IllegalArgumentException e) {
            // Catching inputs out of 32-bit signed integer range
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Catching any other unexpected exceptions
            System.out.println(e);
        }
        sc.close();
    }
}
