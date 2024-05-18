import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_String_Tokens {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        String[] tokens = s.split("[^A-Za-z]+");
        List<String> tokenList = new ArrayList<>();

        for(String token: tokens){
            if(!token.isEmpty()){
                tokenList.add(token);
            }
        }
        System.out.println(tokenList.size());
        for(String token: tokenList){
            System.out.println(token);
        }

    }
}
