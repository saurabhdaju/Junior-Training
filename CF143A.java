package JT;
import java.util.Arrays;
import java.util.Scanner;
public class CF143A {

    static int max(int[] arr) {
        int max = arr[0];
        for(int i=0; i<arr.length; i++) if(arr[i] > max) max = arr[i];
        return max;
    }

    static int min(int[] arr) {
        int min = arr[0];
        for(int i=0; i<arr.length; i++) if(arr[i] < min) min = arr[i];
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        if((d1-r1+c2) % 2!= 0) System.out.println(-1);
        else {
            int[] arr = new int[4];
            arr[3] = (d1-r1+c2)/2;
            arr[0] = d1 - arr[3];
            arr[2] = c1 - arr[0];
            arr[1] = d2 - arr[2];
            if(Arrays.stream(arr).distinct().count() == 4 && max(arr) < 10 && min(arr) > 0) {
                boolean pyamri1 = arr[0] + arr[1] == r1;
                boolean pyamri2 = arr[2] + arr[3] == r2;
                boolean pyamri3 = arr[0] + arr[2] == c1;
                boolean pyamri4 = arr[1] + arr[3] == c2;
                boolean pyamri5 = arr[0] + arr[3] == d1;
                boolean pyamri6 = arr[1] + arr[2] == d2;
                if(pyamri1 && pyamri2 && pyamri3 && pyamri4 && pyamri5 && pyamri6) {
                    System.out.println(arr[0] + " " + arr[1]);
                    System.out.println(arr[2] + " " + arr[3]);
                }
                else System.out.println(-1);
            }
            else System.out.println(-1);
        }
    }
}
