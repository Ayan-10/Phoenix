package Codechef.Lunch.June21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RichieRich {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String[] st = reader.readLine().trim().split("\\s+");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            int x = Integer.parseInt(st[2]);

            System.out.println((b-a)/x);
        }
    }
}
