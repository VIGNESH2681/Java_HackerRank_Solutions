import java.io.*;
import java.util.*;

class Add{
    public void add(int... numbers){
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for(int number: numbers){
            sum += number;
            sb.append(number).append("+");
        }
        sb.setLength(sb.length()-1);
        sb.append("=").append(sum);
        System.out.println(sb.toString());
    }
}

public class Java_Varargs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

        // Read the six integers from input
        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
        }

        Add add1 = new Add();

        // Call the add method with different subsets of the numbers array
        add1.add(numbers[0], numbers[1]);
        add1.add(numbers[0], numbers[1], numbers[2]);
        add1.add(numbers[0], numbers[1], numbers[2], numbers[3], numbers[4]);
        add1.add(numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5]);

        scanner.close();

    }
}
