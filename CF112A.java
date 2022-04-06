package JT;
import java.util.Scanner;
public class CF112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(), str2 = sc.next();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        System.out.println(str1.compareTo(str2)==0 ? "0" : (str1.compareTo(str2)>0 ? "1" : "-1"));
    }
}
