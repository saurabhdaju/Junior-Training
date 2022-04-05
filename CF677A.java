package JT;
import java.util.Scanner;
public class CF677A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), h = sc.nextInt();
        int ans = 0;
        while(n-->0) {
            int a = sc.nextInt();
            ans = (a>h ? ans+2 : ans+1);
        }
        System.out.println(ans);
    }
}
