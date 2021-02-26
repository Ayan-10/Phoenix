package Codeforces.D3_702_1490;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().trim().split("\\s+");
            int p = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s[p++]);
            }
            int hi = 0;
            divcon(0,n,a,hi);
            for(int e : a){
                System.out.print(e+ " ");
            }
            System.out.println();
        }
    }

    private static void divcon(int srt, int end, int[] a,int hi) {

        if(srt>=end){
            return;
        }
        int in = findmax(a,srt,end);
        a[in]=hi;
        divcon(srt,in,a,hi+1);
        divcon(in+1,end,a,hi+1);

    }

    private static int findmax(int[] a, int srt, int end) {
        int ans = Integer.MIN_VALUE;
        int res = 0;
        for(int i = srt; i<end; i++){
            if(a[i]>ans){
                ans=a[i];
                res = i;
            }
        }
        return res;
    }
}