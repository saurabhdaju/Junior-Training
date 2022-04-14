package JT;
import java.util.Scanner;
public class CF443A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        long bin = str.chars().distinct().count();
        System.out.println(bin==2 ? "0" : (bin==3 ? "1" : bin-4));
    }
}
