package JT;
import java.util.Scanner;
public class CF731A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int temp1 = (int) 'a', ans = 0;
        for(int i=0; i<str.length(); i++) {
            int temp2 = (int) str.charAt(i);
            ans += Math.min( Math.abs(temp1 - temp2) , 26-Math.abs(temp1 - temp2) );
            temp1 = temp2;
        }
        System.out.println(ans);
    }
}
