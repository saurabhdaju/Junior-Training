package JT;
import java.util.Scanner;
public class CF1367B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int weven = 0, wodd = 0;
            for(int i=0; i<n; i++) {
                int a = sc.nextInt();
                if(a%2 != i%2 && a%2==1) wodd++;
                else if(a%2 != i%2 && a%2==0) weven++;
            }
            if(wodd == weven) System.out.println(wodd);
            else System.out.println(-1);
        }
    }
}
