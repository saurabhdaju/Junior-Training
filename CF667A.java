package JT;
import java.util.Scanner;
// https://codeforces.com/contest/667/problem/A
public class CF667A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  //Diameter
        int b = sc.nextInt();  // height h
        int c = sc.nextInt();  // output ml/sec
        int d = sc.nextInt();  // input e cm
        double intake = (d * Math.PI * a * a)/4;
        if(c > intake) {
            System.out.println("YES");
            double netFlow = c - intake;
            double volume = (Math.PI * a * a * b)/4;
            System.out.println(volume/netFlow);
        }
        else System.out.println("NO");
    }
}
