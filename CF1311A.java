package JT;
import java.util.Scanner;
public class CF1311A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            int ans = 0;
            if(a==b) System.out.println(0);
            else if(a<b) {
                if((a%2!=0 && b%2!=0) || (a%2==0 && b%2==0)) System.out.println(2);
                else System.out.println(1);
            }
            else {
                if((a%2!=0 && b%2!=0) || (a%2==0 && b%2==0)) System.out.println(1);
                else System.out.println(2);
            }
        }
    }
}
