package JT;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//  https://codeforces.com/problemset/problem/1520/A
public class CF1520A {

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
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int bin = 0;
            String str = sc.next();
            int i = 0;
            boolean pumsi = true;
            ass:while (i<n) {
                boolean pyamri = true;
                char kachra = str.charAt(i);
                for(int j=i+1; j<n; j++) {
                    if(str.charAt(j) == kachra && pyamri == true) i++;
                    else if(str.charAt(j) != kachra) pyamri = false;
                    else if (str.charAt(j) == kachra && pyamri == false) {
                        pumsi = false;
                        break ass;
                    }
                }
                i++;
            }
            System.out.println(pumsi ? "YES" : "NO");
        }
    }
}
