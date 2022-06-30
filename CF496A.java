package JT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://codeforces.com/contest/496/problem/A
public class CF496A {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        int min = arr[2] - arr[0];
        int minidx = 1;
        for(int i=3; i<n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] - arr[i-2] < min) {
                min = arr[i] - arr[i-2];
                minidx = i-1;
            }
        }
        int max = 0;
        for(int i=0; i<n-1; i++) {
            if(i+1 == minidx){
                if(max < arr[i+2] - arr[i]) max = arr[i+2] - arr[i];
                i++;
            }
            else {
                if(max < arr[i+1] - arr[i]) max = arr[i+1] - arr[i];
            }
        }
        System.out.println(max);
    }
}
