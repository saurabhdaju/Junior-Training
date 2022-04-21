package JT;
import java.util.Scanner;
// https://codeforces.com/contest/404/problem/A
public class CF404A {
    public static int freq(String str, char x, String[] arr) {
        int bin = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == arr[0].charAt(0)) bin++;
        }
        return bin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.next();
        }
        if(String.join("",arr).chars().distinct().count() !=2) {
            System.out.println("NO");
            System.exit(0);
        }
        for(int i=0; i<n; i++) {
            if( arr[i].charAt(i) != arr[i].charAt(n-i-1) || arr[i].charAt(i) != arr[0].charAt(0) || arr[i].charAt(n-i-1) != arr[0].charAt(0)) {
                System.out.println("NO");
                System.exit(0);
            }
            else if(i != (n-1)/2 && freq(arr[i], arr[0].charAt(0), arr)!=2) {
                System.out.println("NO");
                System.exit(0);
            }
            else if(i==(n-1)/2 && freq(arr[i], arr[0].charAt(0), arr)!=1) {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
}
