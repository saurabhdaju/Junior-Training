package JT;
import java.util.Scanner;
// https://codeforces.com/contest/255/problem/A
public class CF255A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        for(int i=1; i<=n; i++) {
            int a = sc.nextInt();
            if(i%3==1) a1 += a;
            else if(i%3==2) a2 += a;
            else a3 += a;
        }
        int max = Math.max(Math.max(a1,a2),a3);
        System.out.println(a1==max ? "chest" : (a2==max ? "biceps" : "back"));
    }
}
