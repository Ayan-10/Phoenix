package Codechef.Long_Challenge.MAY21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XORequal {

    final static long MOD = 1000000007L;

    public static void main (String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(reader.readLine());
            while (t-- > 0) {
                long n = Long.parseLong(reader.readLine());

                System.out.println(power(2L,(n-1)));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    static long power(long x, long y)
    {
        long res = 1L;
        x = x % MOD;
        if (x == 0)
            return 0;

        while (y > 0) {
            if ((y & 1) != 0)
                res = (res * x) % MOD;

            y = y >> 1;
            x = (x * x) % MOD;
        }
        return res;
    }
}