package JT;
import java.util.Scanner;
public class CF474A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shift = sc.next();
        String str = sc.next();
        char[] row = {'q' , 'w' , 'e' , 'r' , 't' , 'y' , 'u' , 'i' , 'o' , 'p' , 'a' , 's' , 'd' , 'f' , 'g' , 'h' , 'j' , 'k' , 'l' , ';' , 'z' , 'x' , 'c' , 'v' , 'b' , 'n' , 'm' , ',' , '.' , '/'};
        int chalo = (shift.compareTo("L")==0 ? 1 : -1);
        for(int i=0; i<str.length(); i++) {
            for(int j=0; j<row.length; j++) {
                if(row[j] == str.charAt(i)) {
                    System.out.print(row[j + chalo]);
                    break;
                }
            }
        }
    }
}
