package JT;
import java.util.Scanner;
public class CF268A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] home = new int[n], guest = new int[n];
        for(int i=0; i<n; i++) {
            home[i] = sc.nextInt();
            guest[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(home[i] == guest[j]) ans++;
                if(guest[i] == home[j]) ans++;
            }
        }
        System.out.println(ans);
    }
}
