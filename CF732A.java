package JT;
import java.util.Scanner;
public class CF732A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), r = sc.nextInt();
        int ans = 0;
        for(int i=1; i<=10; i++) {
            ans++;
            if(k*i % 10 ==0 || k*i % 10 == r) break;
        }
        System.out.println(ans);
    }
}
