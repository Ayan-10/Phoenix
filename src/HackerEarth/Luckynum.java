package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Luckynum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
//            String st[] = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().trim().split("\\s+");
            int p = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s[p++]);
            }
            int c=1;
            int max = a[n-1];
            for (int i = n - 2; i >= 0; i--) {
                if(a[i]>max){
                    c++;
                    max=a[i];
                }
            }
            System.out.println(c);
        }
    }
}