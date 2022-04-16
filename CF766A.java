package JT;
import java.util.Scanner;
public class CF766A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        if(str1.compareTo(str2) == 0) System.out.println(-1);
        else System.out.println(Math.max(str1.length(), str2.length()));
    }
}
