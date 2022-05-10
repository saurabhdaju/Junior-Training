package JT;
import java.util.Scanner;
public class CF1294A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            long max = Math.max(Math.max(a,b),c);
            long sum = (3*max) - a - b - c;
            boolean pyamri;
            if((a+b+c+d)%3==0 && d>=sum) pyamri = true;
            else pyamri = false;
            System.out.println(pyamri ? "YES" : "NO");
        }
    }
}
