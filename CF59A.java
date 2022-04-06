package JT;
import java.util.Scanner;
public class CF59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int uc = 0, lc = 0;
        for(int i=0; i<str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) uc++;
            else lc++;
        }
        System.out.println(uc>lc ? str.toUpperCase() : str.toLowerCase());
    }
}
