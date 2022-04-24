package JT;
import java.util.Scanner;
public class CF584A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        if(t!=10) {
            for(int i=1; i<=n; i++) System.out.print(t);
        }
        else {
            if(n==1) System.out.println(-1);
            else if(n%2!=0) {
                for(int i=1; i<=n/2; i++) System.out.print(10);
                System.out.print(0);
            }
            else for(int i=1; i<=n/2; i++) System.out.print(10);
        }
    }
}
