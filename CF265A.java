package JT;
import java.util.Scanner;
public class CF265A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), t = sc.next();
        int ans = 1;
        for(int i=0; i<t.length(); i++) {
            if(s.charAt(ans-1) == t.charAt(i)) ans++;
        }
        System.out.println(ans);
    }
}
