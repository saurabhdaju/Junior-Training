package JT;
import java.util.Arrays;
import java.util.Scanner;
public class CF339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     //OG APPROACH
        String[] arr = sc.next().split("\\+");
        Arrays.sort(arr);
        System.out.println(String.join("+", arr));
    }
}
