package JT;
import java.util.Scanner;
// https://codeforces.com/problemset/problem/1551/A
public class CF1551A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            long n = sc.nextLong();
            System.out.println(n%3==2 ? n/3 + " " + ((n/3)+1) : (n/3)+(n%3) + " " + n/3);
        }
    }
}
