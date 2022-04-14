package JT;
import java.util.Scanner;
public class CF71A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0) {
            String str = sc.next();
            if (str.length() < 11) System.out.println(str);
            else {
                System.out.print(str.charAt(0));
                System.out.print(str.length() - 2);
                System.out.println(str.charAt(str.length() - 1));
            }
        }
    }
}
