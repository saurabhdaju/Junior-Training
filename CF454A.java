package JT;
import java.util.Scanner;
public class CF454A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n/2; i++) {
            for(int j=i; j<=n/2; j++) System.out.print('*');
            for(int j=1; j<=2*i-1; j++) System.out.print('D');
            for(int j=i; j<=n/2; j++) System.out.print('*');
            System.out.println();
        }
        for(int i=1; i<=n; i++) System.out.print('D');
        System.out.println();
        for(int i=n/2; i>=1; i--) {
            for(int j=i; j<=n/2; j++) System.out.print('*');
            for(int j=1; j<=2*i-1; j++) System.out.print('D');
            for(int j=i; j<=n/2; j++) System.out.print('*');
            System.out.println();
        }
    }
}
