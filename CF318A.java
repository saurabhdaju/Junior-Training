package JT;
import java.util.Scanner;
public class CF318A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        System.out.println(k<=(n+1)/2 ? 2*k-1 : 2*(k-(n+1)/2));
    }
}
