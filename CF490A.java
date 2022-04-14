package JT;
import java.util.Scanner;
public class CF490A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++) arr[i] = sc.nextInt();
        int ones = 0, twos = 0, threes = 0;
        for(int i=1; i<=n; i++) {
            if(arr[i] == 1) ones++;
            else if (arr[i]==2) twos++;
            else threes++;
        }
        int idx = 1;
        int[] Narr =  new int[n+1];
        for(int i=1; i<=3; i++) {
            for(int j=1; j<=n; j++) {
                if (arr[j] == i) {
                    Narr[idx] = j;
                    idx++;
                }
            }
        }
        System.out.println(Math.min(ones, Math.min(twos, threes)));
        if(Math.min(ones, Math.min(twos, threes)) != 0) {
            for(int i=1; i<=Math.min(ones, Math.min(twos, threes)); i++) {
                System.out.print(Narr[i] + " ");
                System.out.print(Narr[i+ones] + " ");
                System.out.println(Narr[i+ones+twos]);
            }
        }
    }
}
