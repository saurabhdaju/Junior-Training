package JT;
import java.util.Scanner;
public class CF43A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bin1 = 1, bin2 = 0;
        String str1 = sc.next();
        String str2 = "";
        for(int i=2; i<=n; i++) {
            String str = sc.next();
            if(str.compareTo(str1)==0) bin1++;
            else {
                bin2++;
                str2 = str;
            }
        }
        System.out.println(bin1>bin2 ? str1 : str2);
    }
}
