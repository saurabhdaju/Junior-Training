//https://codeforces.com/contest/431/problem/A

package JT;
import java.util.Scanner;
public class CF431A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=1; i<5; i++) arr[i] = sc.nextInt();

        String str = sc.next();
        int ans = 0;
        for(int i=0; i<str.length(); i++) ans += arr[Integer.parseInt(String.valueOf(str.charAt(i)))];
        System.out.println(ans);
    }
}
