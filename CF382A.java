package JT;
import java.util.Scanner;
// https://codeforces.com/problemset/problem/382/A
public class CF382A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        String str = sc.next();
        int idx = 0;
        int rbin = 0, lbin = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='|') {
                idx = i;
                break;
            }
            lbin++;
        }
        if(idx+1<arr.length) {
            for(int i=idx+1; i<arr.length; i++) rbin++;
        }

        if((str.length()+arr.length-1)%2==0 && Math.min(rbin,lbin)+str.length()>=Math.max(rbin,lbin)) {
            if (lbin<rbin) {
                int sidx = 0;
                for(int i=0; i<idx; i++) System.out.print(arr[i]);
                for(int i=0; i<rbin-lbin; i++) {
                    System.out.print(str.charAt(i));
                    sidx = i;
                }
                if(sidx+1<str.length()) for(int i=1; i<=(str.length()-sidx-1)/2; i++) System.out.print(str.charAt(sidx+i));
                System.out.print("|");
                if(sidx+1+(str.length()-sidx-1)/2 < str.length()) for(int i=sidx+1+(str.length()-sidx-1)/2; i<str.length(); i++)
                    System.out.print(str.charAt(i));

                if(idx+1 < arr.length) for(int i=idx+1; i<arr.length; i++) System.out.print(arr[i]);
            }

            else if(rbin<lbin) {
                if(str.length()-lbin+rbin==0) {
                    for (int i = 0; i < idx; i++) System.out.print(arr[i]);
                    System.out.print("|");
                    if (idx + 1 < arr.length) for (int i = idx + 1; i < arr.length; i++) System.out.print(arr[i]);
                    System.out.print(str);
                }
                else {
                    for (int i = (str.length() - (rbin - lbin)) / 2; i < str.length(); i++)
                        System.out.print(str.charAt(i));
                    for (int i = 0; i < idx; i++) System.out.print(arr[i]);
                    System.out.print("|");
                    if (idx + 1 < arr.length) for (int i = idx + 1; i < arr.length; i++) System.out.print(arr[i]);
                    if (str.length() - (lbin - rbin) > 0)
                        for (int i = 0; i < (str.length() - (rbin - lbin)) / 2; i++) System.out.print(str.charAt(i));
                }
            }
            else {
                for(int i=0; i<idx; i++) System.out.print(arr[i]);
                for(int i=0; i<str.length()/2; i++) System.out.print(str.charAt(i));
                System.out.print("|");
                for(int i=str.length()/2; i<str.length(); i++) System.out.print(str.charAt(i));
                if(idx+1<arr.length) for(int i=idx+1; i<arr.length; i++) System.out.print(arr[i]);
            }
        }
        else System.out.println("Impossible");
    }
}
