package JT;
import java.util.Scanner;
public class CF709A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long b = sc.nextInt();
        long d = sc.nextInt();
        long waste = 0, ans = 0;
        while(n-->0) {
            long a = sc.nextInt();
            if(a<=b) {
                if(waste+a > d) {
                    waste = 0;
                    ans++;
                }
                else waste += a;
            }
        }
        System.out.println(ans);
    }
}
