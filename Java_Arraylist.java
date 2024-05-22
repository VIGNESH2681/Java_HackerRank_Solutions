import java.util.ArrayList;
import java.util.Scanner;

public class Java_Arraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of lines
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>(n);

        // Read each line
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            ArrayList<Integer> line = new ArrayList<>(d);
            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt());
            }
            lines.add(line);
        }

        // Read the number of queries
        int q = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        // Process each query
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // Check if x and y are within the bounds
            if (x <= n && x >= 1) {
                ArrayList<Integer> line = lines.get(x - 1);
                if (y <= line.size() && y >= 1) {
                    result.append(line.get(y - 1)).append("\n");
                } else {
                    result.append("ERROR!\n");
                }
            } else {
                result.append("ERROR!\n");
            }
        }

        // Output all results at once
        System.out.print(result.toString());

        scanner.close();
    }
}
