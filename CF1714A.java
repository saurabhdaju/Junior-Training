package JT;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/1714/A
public class CF1714A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte test = input.nextByte();
        while(test-->0) {
            byte works = input.nextByte();
            byte sleepH = input.nextByte();
            byte sleepM = input.nextByte();
            int sleepMins = 60*sleepH + sleepM;

            boolean noSleep = false;
            int todayMins= -1;
            int todayDiff = Integer.MAX_VALUE;
            int nextMins = -1;
            int nextDiff = Integer.MIN_VALUE;

            while (works-->0) {
                byte hr = input.nextByte();
                byte min = input.nextByte();

                int workMins = 60*hr + min;
                if(workMins > sleepMins) {
                    if(workMins - sleepMins < todayDiff) {
                        todayDiff = workMins - sleepMins;
                        todayMins = workMins;
                    }
                }
                else if(workMins < sleepMins) {
                    if(sleepMins - workMins > nextDiff) {
                        nextDiff = sleepMins - workMins;
                        nextMins = workMins;
                    }
                }
                else noSleep = true;
            }

            if(noSleep) System.out.println("0 0");
            else if(todayMins != -1) System.out.println((todayDiff/60) + " " + (todayDiff%60));
            else {
                int mins = 1440 - sleepMins + nextMins;
                System.out.println((mins/60) + " " + (mins%60));
            }
        }
    }
}
