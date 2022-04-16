package JT;
import java.util.Scanner;
public class CF520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.next();
        int dist = (int) str.toLowerCase().chars().distinct().count();
        System.out.println(dist==26 ? "YES" : "NO");
    }
}
