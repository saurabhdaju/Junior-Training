package JT;
import java.util.Scanner;
import java.util.Arrays;
// http://codeforces.com/contest/365/problem/A
public class CF365A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int bin = 0;
        while(n-->0) {
            int num = sc.nextInt();
            int[] arr = new int[k+1];
            while(num>0) {
                int temp = num%10;
                if(temp<k+1) arr[temp] +=1;
                num /= 10;
            }
            byte ass = 1;
            for(int i=0; i<k+1; i++) {
                if(arr[i] == 0) {
                    ass = 0;
                    break;
                }
            }
            if(ass==1) bin++;
        }
        System.out.println(bin);
    }
}