package cp_algo.binary_exp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class modx {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String st[] = reader.readLine().trim().split("\\s+");
            long a = Long.parseLong(st[0]);
            long b = Long.parseLong(st[1]);
            long m = Long.parseLong(st[2]);
            long ans = pow(a,b,m);
            System.out.println(ans);
        }
    }

    private static long pow(long a, long b, long m) {
        a= a%m;
        long res = 1;
        while(b>0){
            if(b%2!=0){
                res = res * a%m;
            }
            a = a *a%m;
            b=b/2;
        }
        return res;
    }
}