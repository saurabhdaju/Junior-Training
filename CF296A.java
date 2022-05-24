package JT;
import java.util.Scanner;
public class CF296A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1001];
        for(int i=0; i<n; i++) arr[sc.nextInt()] +=1;
        boolean pyamri = true;
        for(int i=1; i<=1000; i++) {
            if(arr[i] > Math.ceil(n/(2*1.0))) {
                pyamri = false;
                break;
            }
        }
        System.out.println(pyamri ? "YES" : "NO");
    }
}
