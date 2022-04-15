package JT;
import java.util.Scanner;
public class CF567A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextLong();
        System.out.println(Math.abs(arr[0] - arr[1]) + " " + Math.abs(arr[0] - arr[n-1]));
        for(int i=1; i<n-1; i++) System.out.println( Math.min(Math.abs(arr[i] - arr[i-1]), Math.abs(arr[i] - arr[i+1]))  + " " + Math.max(Math.abs(arr[i] - arr[n-1]) , Math.abs(arr[i] - arr[0])));
        System.out.println(Math.abs(arr[n-1] - arr[n-2]) + " " + Math.abs(arr[0] - arr[n-1]));
    }
}
