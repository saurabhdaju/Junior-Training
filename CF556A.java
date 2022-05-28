package JT;
import java.util.Scanner;
public class CF556A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int ones = 0, zeros = 0;
        for(int i=0; i<n; i++) {
            if(str.charAt(i)=='1') ones++;
            else zeros++;
        }
        System.out.println(n - (2*Math.min(ones, zeros)));
    }
}
