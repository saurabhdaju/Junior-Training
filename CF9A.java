package JT;
import java.util.Scanner;
public class CF9A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int num = 7 - Math.max(a,b);
        if(num%6==0) System.out.println("1/1");
        else if(num%2==0) System.out.println((num/2) + "/3");
        else if (num%3==0) System.out.println((num/3) + "/2");
        else System.out.println(num + "/6");
    }
}