package JT;
import java.util.Scanner;
public class CF266A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        String str = sc.next();
        char temp = str.charAt(0);
        for(int i=1; i<n; i++) {
            if(str.charAt(i) == temp) ans++;
            temp = str.charAt(i);
        }
        System.out.println(ans);
    }
}
