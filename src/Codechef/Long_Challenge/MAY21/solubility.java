package Codechef.Long_Challenge.MAY21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solubility {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String[] st = reader.readLine().trim().split("\\s+");
            int x = Integer.parseInt(st[0]);
            int a = Integer.parseInt(st[1]);
            int b = Integer.parseInt(st[2]);

            int sol = a + ((100 - x)*b);

            System.out.println(sol*10);
        }
    }
}
