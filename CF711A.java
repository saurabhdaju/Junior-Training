package JT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF711A {

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
        String[] arr = new String[n];
        boolean pyamri = false;
        int i1  = 0, j1 = 0;
        for(int i=0; i<n; i++) {
            arr[i]= sc.next();
            if(arr[i].charAt(0)=='O' && arr[i].charAt(1)=='O') {
                pyamri = true;
                i1 = i;
                j1 = 0;
            }
            else if (arr[i].charAt(3)=='O' && arr[i].charAt(4)=='O') {
                pyamri = true;
                i1 = i;
                j1 = 3;
            }
        }
        System.out.println(pyamri ? "YES" : "NO");
        if(pyamri) {
           for(int i=0; i<n; i++) {
               if(i!=i1) System.out.println(arr[i]);
               else {
                   for(int j=0; j<5; j++) {
                       if(j==j1 || j==j1+1) System.out.print('+');
                       else System.out.print(arr[i].charAt(j));
                   }
                   System.out.println();
               }
           }
        }
    }
}
