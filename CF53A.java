package JT;
// THE WORST APPROACH IS USED
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// https://codeforces.com/contest/53/problem/A
public class CF53A {

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
        int n = sc.nextInt();
        String arr[] = new String[n];
        int idx = 0 ;
        for(int i=0; i<n; i++) {
            String a = sc.next();
             if(a.length()>=str.length() && str.compareTo(a.substring(0,str.length()))==0) {
                 arr[idx] = a;
                 idx++;
             }
        }
        boolean pyamri = false;
        for(int i=0; i<n; i++) {
            if(i != idx) {
                pyamri = true;
                arr[0] = (arr[0].compareTo(arr[i]) > 0 ? arr[i] : arr[0]);
            }
            else break;
        }
        System.out.println(pyamri ? arr[0] : str);
    }
}