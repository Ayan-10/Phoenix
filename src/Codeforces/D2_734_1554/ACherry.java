package Codeforces.D2_734_1554;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ACherry {

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
            Arrays.sort(a);
            int second = a[n-1];
            for(int i = n - 2; i >= 0; i--){
                if(a[i]==second){
                    second = a[i];
                } else {
                    second = a[i];
                    break;
                }
            }
            System.out.println((long)second*a[n-1]);
        }
    }
}
