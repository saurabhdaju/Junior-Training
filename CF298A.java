package JT;
import java.util.Scanner;
public class CF298A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int Rs = 0;
        int Ls = 0;
        for(int i=0; i<n; i++) {
            if(str.charAt(i) == 'R') Rs++;
            else if(str.charAt(i) == 'L') Ls++;
        }
        if(Ls == 0 && Rs == 0) System.out.println("1 1");

        else if(Ls == 0) {
            for(int i=0; i<n; i++) {
                if(str.charAt(i) == 'R') {
                    System.out.print(i+1 + " ");
                    break;
                }
            }
            for(int i=n-1; i>0; i--) {
                if(str.charAt(i) == 'R') {
                    System.out.println(i+2);
                    break;
                }
            }
        }

        else if(Rs == 0) {
            for(int i=n-1; i>0; i--) {
                if(str.charAt(i) == 'L') {
                    System.out.print(i+1 + " ");
                    break;
                }
            }
            for(int i=0; i<n; i++) {
                if(str.charAt(i) == 'L') {
                    System.out.println(i);
                    break;
                }
            }
        }

        else {
            boolean pyamri = true;
            for(int i=0; i<n; i++) {
                if(str.charAt(i) == 'R' && pyamri) {
                    System.out.print(i+1 + " ");
                    pyamri = false;
                }
                else if(str.charAt(i) == 'L' && !pyamri) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
