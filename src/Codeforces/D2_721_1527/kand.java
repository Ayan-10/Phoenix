package Codeforces.D2_721_1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kand {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            int ans = 0;
            while (n > 0) {
                ans = n-1;
                n &= (n - 1);
            }
            System.out.println(ans);
        }
    }
}