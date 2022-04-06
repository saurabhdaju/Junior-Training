package JT;
import java.util.Scanner;
public class CF791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int ans = 0;
        while(a<=b) {
            a *= 3;
            b *= 2;
            ans++;
        }
        System.out.println(ans);
    }
}