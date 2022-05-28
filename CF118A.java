package JT;
import java.util.Scanner;
public class CF118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        for(int i=0; i<str.length(); i++) {
            boolean pyamri = str.charAt(i) == 'a' || str.charAt(i) == 'o' || str.charAt(i) == 'y' || str.charAt(i) == 'e' || str.charAt(i) == 'u' || str.charAt(i) == 'i';
            if(!pyamri) System.out.print("." + str.charAt(i));
        }
    }
}
