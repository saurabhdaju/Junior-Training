package JT;
import java.util.Scanner;
public class CF770A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(), k = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.print(Character.toChars('a' + i%k));
        }
    }
}
