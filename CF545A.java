package JT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://codeforces.com/contest/545/problem/A
public class CF545A {

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
        int bin = 0, idx = 0;
        int[] arr = new int[n];
        for(int i=1; i<=n; i++) {
            boolean pyamri = true;
            for(int j=1; j<=n; j++){
                int a = sc.nextInt();
                if(a==3 || a==1) pyamri = false;
            }
            if(pyamri) {
                bin++;
                arr[idx] = i;
                idx++;
            }
        }
        System.out.println(bin);
        for(int i=0; i<n; i++) {
            if(arr[i] != 0) System.out.print(arr[i] + " ");
            else break;
        }
    }
}
