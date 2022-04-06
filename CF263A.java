package JT;
import java.util.Scanner;
public class CF263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<25; i++)  {
            System.out.print(sc.nextInt()==1 ? Math.abs(i/5-2) + Math.abs(i%5-2) : "");
        }
    }
}
