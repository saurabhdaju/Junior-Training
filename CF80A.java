package JT;
import java.util.Scanner;
public class CF80A {

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0) return false;
        return true;
    }

    static int nextPrime(int N) {
        if (N <= 1) return 2;
        int prime = N;
        boolean found = false;
        while (!found) {
            prime++;
            if (isPrime(prime)) found = true;
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(nextPrime(n) == m ? "YES" : "NO");
    }
}
