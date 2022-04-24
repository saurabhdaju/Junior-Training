package JT;
import java.util.Scanner;
public class CF127A {

    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)*1.0 );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        double distot = 0;
        for(int i=1; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            distot += distance(a1, b1, a, b);
            a1 = a;
            b1 = b;
        }
        distot *= k;
        double ans = distot/50;
        System.out.println(ans);
    }
}
