package Codeforces.D2_720_1521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class goodArrayGCD {

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
            for(int i = 1; i<n; i++){
                int gcd = gcd(a[i-1],a[i]);
                if(gcd != 1){
                    
                }
            }
        }
    }
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
