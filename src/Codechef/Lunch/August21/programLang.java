package Codechef.Lunch.August21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * programLang
 */
public class programLang {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String[] s = reader.readLine().trim().split("\\s+");
            int p = 0;
            int[] a = new int[6];
            for (int i = 0; i < 6; i++) {
                a[i] = Integer.parseInt(s[p++]);
            }
            int r1 = a[0];
            int r2 = a[1];
            if((r1 == a[2] || r1 == a[3]) && (r2 == a[2] || r2 == a[3])) {
                System.out.println(1);
            } else if ((r1 == a[4] || r1 == a[5]) && (r2 == a[4] || r2 == a[5])){
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }
    }

}