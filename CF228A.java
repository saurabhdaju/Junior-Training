package JT;
import java.util.Arrays;
import java.util.Scanner;
public class CF228A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        System.out.println(4 - Arrays.stream(arr).distinct().count());
    }
}
