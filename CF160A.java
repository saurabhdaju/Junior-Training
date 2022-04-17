package JT;
import java.util.Arrays;
import java.util.Scanner;
public class CF160A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), totsum = 0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            totsum += arr[i];
        }
        Arrays.sort(arr);
        int ans = 0, mysum = 0;
        for(int i=n-1; mysum<=totsum; i--) {
            mysum += arr[i];
            totsum -= arr[i];
            ans++;
        }
        System.out.println(ans);
    }
}