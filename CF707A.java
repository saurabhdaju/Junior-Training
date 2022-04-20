package JT;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// https://codeforces.com/contest/707/problem/A
public class CF707A {

        //FASTREADER
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
            int m = sc.nextInt();
            int bin = 0;
            for(int i=1; i<=n*m; i++) {
                String str = sc.next();
                if(str.compareTo("C")==0 || str.compareTo("M")==0 || str.compareTo("Y")==0) bin++;
            }
        System.out.println(bin==0 ? "#Black&White" : "#Color");
    }
}
