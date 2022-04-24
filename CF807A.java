package JT;
import java.util.Scanner;
public class CF807A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bin1 = 0;
        int bin2 = 0;
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        if(a1 !=b1) bin1++;
        for(int i=1; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a!=b) bin1++;
            if(a>a1 || b>b1) bin2++;
            a1=a;
            b1=b;
        }
        if(bin1 != 0) System.out.println("rated");
        else if(bin2 != 0) System.out.println("unrated");
        else System.out.println("maybe");
    }
}