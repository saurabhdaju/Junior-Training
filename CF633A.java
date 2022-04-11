package JT;
import java.util.Scanner;
public class CF633A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if(c%a==0 || c%b==0) System.out.println("YES");
        else {
            int bin = 0, a_baap = a, b_baap = b;
            while (a_baap <= c && b_baap <= c) {
                if ((c - a_baap) % b == 0 || (c - b_baap) % a == 0) {
                    System.out.println("YES");
                    bin++;
                    break;
                }
                a_baap += a;
                b_baap += b;
            }
            if (bin == 0) System.out.println("NO");
        }
    }
}