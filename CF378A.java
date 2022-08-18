package JT;

import java.util.Scanner;
//https://codeforces.com/contest/378/problem/A
public class CF378A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte a = in.nextByte();
        byte b = in.nextByte();

        // We will check the result of every match for all dice numbers(1,2,3,4,5,6)

        byte awins = 0;    // no of times first player will wins
        byte bwins = 0;    // no if times second player will wins
        byte draws = 0;    // no of times the match would a draw
        byte diceno = 1;   // the no which came when the dice was rolled

        do {
            if(Math.abs(a-diceno) < Math.abs(b-diceno)) awins++;     // if the distance between 'a and diceno' < distance between 'b and diceno' => first player is more accurate than second player => first player wins => awins++
            else if(Math.abs(a-diceno) > Math.abs(b-diceno)) bwins++;     //just opposite of the above explanation
            else draws++;     // if both are equidistant from the diceno then nobody wins => draws++
            diceno++;     //Increasing the diceno to check the result for the next value of the diceno
        } while (diceno<=6);

        System.out.println(awins + " " + draws + " " + bwins);
    }
}