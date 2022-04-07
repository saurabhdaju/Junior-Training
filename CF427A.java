package JT;
import java.util.Scanner;
public class CF427A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, police = 0;
        for(int i=1; i<=n; i++) {
            int a = sc.nextInt();
            if(police+a < 0 ) ans++;
            else  police += a;
        }
        System.out.println(ans);
    }
}
