package JT;

import java.util.ArrayList;
import java.util.Scanner;
//https://codeforces.com/contest/1535/problem/B
public class CF1535B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();
            System.out.println(goodIndexPairs(arr));
        }

    }

    static int goodIndexPairs(int[] arr) {
        int odds = 0; // no of odd numbers in the array
        int evens = 0; // no of even numbers in the array

        //Storing odd numbers in a arrayList for checking there gcd.
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 == 0) //counting even nos
                evens++;
            else{
                odds++; //counting odd nos
                list.add(arr[i]); //adding the odd number to the arraylist
            }
        }

        int ans = 0; // ans denotes the no of good index pairs.

        // there can be 3 combinations for getting gcd of two numbers.
        //1. gcd of two odd numbers    : always >=1  (since 1 is inclusive, we have to check every odd's  gcd , for which we are separating all odd numbers in arraylist)
        //2. gcd of two even numbers   : always >=2
        //3.gcd of an odd and an even number

        //In this ques. we are asked to check for gcd(i, 2*j) > 1
        //the j is always multiplied by 2 making it an even number
        //this means if we arrange the array in a way that the second element i.e. j is always odd. Therefore, for all even numbers the gcd of even and 2*odd >= 2
        //by this we can maximize the good index pair


        //no of pairs we can form by a list of k elements  =  (k*(k-1))/2

        //since all even nos will always give gcd>1
        ans = (evens * (evens - 1)) / 2;

        //for all odds
        for(int i=0; i<odds-1; i++) {
            for(int j=i+1; j < odds; j++) {
                if (gcd( list.get(i), list.get(j) ) > 1) ans++;
            }
        }

        //for  one even and one odd , the  no of pairs = evens * odds
        //and all of these pairs will give gcd > 1 , explained above.
        ans += evens * odds;
        return ans;
    }

    static int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
}
