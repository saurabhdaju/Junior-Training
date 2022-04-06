package JT;
import java.util.Scanner;
public class CF381A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int Sereja = 0, Dima = 0;
        int i =0, j = n-1, bin = 1;
        while(i != j) {
            if(bin%2 !=0) {
                if(arr[i] > arr[j]) {
                    Sereja += arr[i];
                    i++;
                }
                else {
                    Sereja += arr[j];
                    j--;
                }
            }
            else {
                if(arr[i] > arr[j]) {
                    Dima += arr[i];
                    i++;
                }
                else {
                    Dima += arr[j];
                    j--;
                }
            }
            bin++;
        }
        if(bin%2==0) Dima += arr[i];
        else Sereja += arr[i];
        System.out.println(Sereja + " " + Dima);
    }
}
