package JT;
import java.util.Scanner;
public class CF129A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0, odd = 0;
        for(int i=1; i<=n; i++) {
            if(sc.nextInt()%2 == 0)even++;
            else odd++;
        }
        System.out.println(odd%2==0 ? even : odd);
    }
}
