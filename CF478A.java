package JT;
//https://codeforces.com/contest/478/problem/A
import java.util.Scanner;
public class CF478A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int i=1; i<=5; i++) sum += input.nextInt();
        System.out.println(sum%5==0 && sum!=0 ? sum/5 : -1);
    }
}
