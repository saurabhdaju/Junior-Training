package JT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//   https://codeforces.com/contest/514/problem/A
public class CF514A {

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
        if (str.length() == 1) {
            int digit = Integer.parseInt(str);
            System.out.println(digit == 0 || digit==9 ? 9 : (9 - digit < digit ? 9 - digit : digit));
        } else {
            int pyamri = Integer.parseInt(String.valueOf(str.charAt(0)));
            if(pyamri!=0 && pyamri!=9) System.out.print(9 - pyamri < pyamri ? 9 - pyamri : pyamri);
            else if(pyamri==9) System.out.print(9);
            for (long i = 1; i < str.length(); i++) {
                int digit = Integer.parseInt(String.valueOf(str.charAt((int) i)));
                System.out.print(9 - digit < digit ? 9 - digit : digit);
            }
        }
    }
}
