package JT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// https://codeforces.com/contest/721/problem/A?f0a28=1
public class CF721A {

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
        String str = sc.next();
        int chumt = 0;
        boolean ass = false;
        for(int i=0; i<n; i++) {
            if(str.charAt(i)=='B' && !ass) {
                chumt++;
                ass = true;
            }
            else if(str.charAt(i)=='W') ass = false;
        }
        System.out.println(chumt);
        int bin = 0;
        boolean pyamri = false;
        for(int i=0; i<n; i++) {
            if(str.charAt(i)=='B') {
                bin++;
                pyamri = true;
                if(i==n-1) System.out.print(bin);
            }
            else if(str.charAt(i) == 'W' && pyamri) {
                System.out.print( bin + " ");
                bin = 0;
                pyamri = false;
            }
        }
    }
}
