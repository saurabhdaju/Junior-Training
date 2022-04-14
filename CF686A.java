package JT;
import java.util.Scanner;
public class CF686A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long packs = sc.nextInt(), bin = 0;
        while(a-->0) {
            String str = sc.next();
            long x = sc.nextLong();
            if(str.charAt(0) == '+') packs += x;
            else {
                if(x <=packs) packs -= x;
                else bin++;
            }
        }
        System.out.println(packs + " " + bin);
    }
}
