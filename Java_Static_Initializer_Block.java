import java.util.Scanner;

public class Java_Static_Initializer_Block {
    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
        else{
            flag = true;
        }

    }

    public static void main(String[] args) {

        if(flag){
            int area = B*H;
            System.out.println(area);
        }
    }
}
