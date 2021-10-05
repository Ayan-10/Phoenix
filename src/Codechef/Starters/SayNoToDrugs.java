

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SayNoToDrugs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String st[] = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            int k = Integer.parseInt(st[1]);
            int l = Integer.parseInt(st[2]);
            String[] s = reader.readLine().trim().split("\\s+");
            int p = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s[p++]);
            }

            int max = a[0];
            for (int i : a) {
                max = Math.max(max, i);
            }

            if(k>0){
            if(a[n-1]+(l-1)*k > max){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
        }
    }
}
