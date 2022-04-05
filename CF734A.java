package JT;
import java.util.Scanner;
public class CF734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int anton = 0, danik = 0;
        String str = sc.next();
        for(int i=0 ; i<n; i++) {
            if(str.charAt(i) == 'A') anton++;
            else danik++;
        }
        System.out.println(anton>danik ? "Anton" : (danik>anton ? "Danik" : "Friendship"));
    }
}
