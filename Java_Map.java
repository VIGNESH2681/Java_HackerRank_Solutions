import java.util.*;
import java.io.*;

public class Java_Map {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Map<String,Integer> phoneBook =new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phoneBook.put(name,phone);
        }

        while(in.hasNextLine())
        {
            String s=in.nextLine();
            if(phoneBook.containsKey(s)){
                System.out.println(s + "=" + phoneBook.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();

    }
}
