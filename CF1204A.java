package JT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
//    https://codeforces.com/contest/1204/problem/A
public class CF1204A {

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
        String str = sc.next();
        BigInteger n = BigInteger.valueOf(0);
        BigInteger power2 = BigInteger.valueOf(1);
        for(long i=str.length()-1; i>=0; i--) {
            n = n.add(power2.multiply(BigInteger.valueOf(Long.parseLong(String.valueOf(str.charAt((int) i))))));
            power2 = power2.multiply(BigInteger.valueOf(2));
        }
        BigInteger huehue = new BigInteger("1");
        int ans = 0;
        while(huehue.compareTo(n) < 0) {
            huehue = huehue.multiply(BigInteger.valueOf(4));
            ans++;
        }
        System.out.println(ans);
    }
}