package MashUps.mashup_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContestStart {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String[] s = reader.readLine().trim().split("\\s+");
            int p = 0;
            long[] a = new long[3];
            for (int i = 0; i < 3; i++) {
                a[i] = Long.parseLong(s[p++]);
            }
            long n = a[0];
            long x = a[1];
            long tt = a[2];

            if(x>tt) {
                System.out.println(0);
            }
            else if((tt/x) >= n-1) {
                long res = n*(n-1)/2l;
                System.out.println(res);
            }
            else {
                long res =0;
                long tmp =(tt/x);
                res+=((n-tmp)*tmp);
                res+=(((n-(n-tmp)-1) *(n-(n-tmp)))/2l);
                System.out.println(res);
            }
        }
    }
}
