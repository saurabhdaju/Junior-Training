package JT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF699A {

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
        char[] str = sc.next().toCharArray();
        int[] arr = new int[n];
        int ridx = -1;
        boolean fax = false;
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int ans = arr[arr.length-1] + arr[0];
        for(int i=0; i<n; i++) {
            if(str[i]=='R') ridx=i;
            else if(str[i]=='L' && ridx!=-1 && i-1==ridx) {
                fax = true;
                ans = Math.min(ans, (arr[i]-arr[ridx])/2);
            }
        }
        System.out.println(fax ? ans : -1);
    }
}
