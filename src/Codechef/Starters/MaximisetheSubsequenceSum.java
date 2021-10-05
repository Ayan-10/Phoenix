

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaximisetheSubsequenceSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String st[] = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            int k = Integer.parseInt(st[1]);
            String[] s = reader.readLine().trim().split("\\s+");
            int p = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s[p++]);
            }

            Arrays.sort(a);
            int sum = 0;

            int j = n-1;
            while(j>=0 && a[j]>0){
                sum+=a[j];
                j--;
            }
            int i = 0;
            while(i<n && a[i]<0 && k>0){
                sum+=a[i]*-1;
                i++;
                k--;
            }

            System.out.println(sum);
        }
    }
}
