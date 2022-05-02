package JT;
import java.util.Scanner;
// https://codeforces.com/problemset/problem/1672/B
public class CF1672B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String str = sc.next();
            if(str.length()==1 || str.charAt(0)=='B' || str.charAt(str.length()-1)=='A') System.out.println("NO");
            else {
                int a = 0, b = 0;
                byte humt = 1;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'A') a++;
                    else {
                        b++;
                        if (b > a) {
                            humt = 0;
                            break;
                        }
                    }
                }
                System.out.println(humt == 1 ? "YES" : "NO");
            }
        }
    }
}