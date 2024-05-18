import java.util.*;

public class Java_Loops_II {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // Generate and print the series for the current query
            printSeries(a, b, n);
        }
        in.close();
    }

    static void printSeries(int a, int b, int n){
        int term = a;
        for(int i=0;i<n;i++){
            term += Math.pow(2,i)*b;
            System.out.print(term+ " ");
        }
        System.out.println();
    }
}
