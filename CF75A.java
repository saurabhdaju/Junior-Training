package JT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF75A {

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
        String a = sc.next();
        String b = sc.next();
        String c = String.valueOf(Long.parseLong(a) + Long.parseLong(b));
        String str1 = "", str2 = "", str3 = "";
        for(int i=0; i<a.length(); i++) {
            if(a.charAt(i)!='0') str1 += a.charAt(i);
        }
        for(int i=0; i<b.length(); i++) {
            if(b.charAt(i)!='0') str2 += b.charAt(i);
        }
        for(int i=0; i<c.length(); i++) {
            if(c.charAt(i)!='0') str3 += c.charAt(i);
        }
        System.out.println(str3.compareTo(String.valueOf(Long.parseLong(str1)+Long.parseLong(str2)))==0 ? "YES" : "NO");
    }
}
