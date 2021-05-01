package Codechef.Lunch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRot {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final int M = 1000000007;
            int n = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().trim().split("\\s+");
            int p = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s[p++]);
            }
            int q = Integer.parseInt(reader.readLine());
            String[] st = reader.readLine().trim().split("\\s+");
            int r = 0;
            int[] b = new int[q];
            for (int i = 0; i < q; i++) {
                b[i] = Integer.parseInt(st[r++]);
            }
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum = (sum+a[i]+M)%M;
            }
            while(q-->0){
             sum = (sum + sum)%M;
                System.out.println(sum);
            }

    }
}
