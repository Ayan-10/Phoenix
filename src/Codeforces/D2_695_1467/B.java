package Codeforces.D2_695_1467;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
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
            int c=0;
            int hil=0;
            int val=0;
            for (int i = 1; i < n-1; i++) {
                if(a[i]>a[i+1] && a[i]>a[i-1]){
                    if(c==0) {
                        a[i+1] = a[i];
                        c++;
                    }else{
                        hil++;
                    }
                }else if(a[i]<a[i+1] && a[i]<a[i-1]){
                    if(c==0) {
                        a[i-1] = a[i];
                        c++;
                    }else{
                        val++;
                    }
                }
            }
            System.out.println(hil+val);
        }
    }
}