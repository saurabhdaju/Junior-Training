package JT;
import java.util.Scanner;
public class CF344A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        byte temp = 0;
        long ans = 0;
        for(int i=1; i<=n; i++) {
            byte a = sc.nextByte();
            if(a != temp) ans++;
            temp = a;
        }
        System.out.println(ans);
    }
}
