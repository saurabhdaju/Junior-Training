package JT;
import java.util.Scanner;
public class CF294A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++) arr[i] = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1; i<=m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a-1>0) arr[a-1] += b-1;
            if(a+1<=n) arr[a+1] += arr[a]-b;
            arr[a] = 0;
        }
        for(int i=1; i<=n; i++) System.out.println(arr[i]);
    }
}
