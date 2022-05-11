package JT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF287A {

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
        char[][] arr = new char[4][4];
        for(int i=0; i<4; i++) {
            arr[i] = sc.next().toCharArray();
        }
         boolean pyamri = false;
        humt : for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                int char1 = 1, char2 = 0;
                    if(arr[i+1][j]==arr[i][j]) char1++;
                    else char2++;
                    if(arr[i][j+1]==arr[i][j]) char1++;
                    else char2++;
                    if(arr[i+1][j+1]==arr[i][j]) char1++;
                    else char2++;
                    if(Math.max(char1, char2)>=3){
                        pyamri = true;
                        break humt;
                    }
            }
        }
        System.out.println(pyamri ? "YES" : "NO");
    }
}
