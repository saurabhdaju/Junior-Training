package JT;
import java.util.Scanner;
public class CF218A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        int k = sc. nextInt();
        int[] arr = new int[2*n+2];
        for(int i=1; i<=(2*n+1); i++) arr[i] = sc.nextInt();
        int temp1 = arr[2*n+1];
        int temp2 = arr[2*n-1];
        for(int i=2*n; i>=2; i-=2) {
                if (arr[i] - 1 > temp1 && arr[i] - 1 > temp2 && k>0) {
                    arr[i] -= 1;
                    k--;
                }
                temp1 = temp2;
                if(i-3>=1) temp2 = arr[i-3];
                else temp2 = 0;
        }
        for(int i=1; i<=(2*n+1); i++) System.out.print(arr[i] + " ");
    }
}
