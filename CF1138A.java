package JT;

import java.util.Scanner;
// https://codeforces.com/problemset/problem/1138/A

// although the question is of binary search but since i am not getting an idea of how to do it with binary search , so i'm trying linear search here.
// btw its not giving me TLE :)
public class CF1138A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ones = 0;
        int twos = 0;
         if(in.nextInt() == 1 ) ones++;
         else twos++;
         boolean check = true;
         int max = 0;

         while(n-->1) {
             int input = in.nextInt();

             if(input == 2 && check) twos++;
             else if (input == 1 && check) {
                 check = false;
                 max = Math.max(max , Math.min(ones, twos));
                 ones = 1;
             }
             else if(input == 1 && !check) ones++;
             else {
                 check = true;
                 max = Math.max(max , Math.min(ones, twos));
                 twos = 1;
             }
         }
         max = Math.max(max, Math.min(ones, twos));

        System.out.println(max * 2);
    }
}
