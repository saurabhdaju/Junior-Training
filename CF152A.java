package JT;

import java.util.ArrayList;
import java.util.Scanner;

//https://codeforces.com/contest/152/problem/A
public class CF152A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int students = input.nextInt();
        int subjects = input.nextInt();

        String[] arr = new String[students];
        for(int i=0; i<students; i++) arr[i] = input.next();

        System.out.println(solution(students, subjects, arr));
    }

    static int solution(int students, int subjects, String[] array) {
        int[][] arr = StringToInt(students, subjects, array);

        ArrayList<Integer> list = new ArrayList<>(subjects);

        for (int col=0; col<subjects; col++) {
            int max = max(arr, col);
            for(int row=0; row<students; row++) {
                if(arr[row][col] == max) list.add(row);
            }
        }

        int ans = (int) list.stream().distinct().count();
        return ans;
    }

    static int[][] StringToInt (int students, int subjects, String[] array) {
        int[][] arr = new int[students][subjects];

        for(int row=0; row<students; row++) {
            for(int col=0; col<subjects; col++) {
                arr[row][col] = Integer.parseInt(String.valueOf(array[row].charAt(col)));

            }
        }

        return arr;
    }

    static int max(int[][] arr, int col) {
        int max = arr[0][col];
        for(int row=1; row<arr.length; row++)
            if(arr[row][col] > max) max = arr[row][col];
        return max;
    }

}