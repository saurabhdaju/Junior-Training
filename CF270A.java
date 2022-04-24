package JT;
import java.util.Scanner;
public class CF270A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int a = sc.nextInt();
            System.out.println(360%(180-a)==0 ? "YES" : "NO");
        }
    }
}
