package JT;
import java.util.Scanner;
public class CF236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.chars().distinct().count()%2==0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}
