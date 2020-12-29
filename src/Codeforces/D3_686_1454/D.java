package Codeforces.D3_686_1454;

import java.io.*;
import java.util.*;

public class D {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            long n = Long.parseLong(reader.readLine());
            HashMap<Long,Integer> p = getFactorization(n);
            long k = getHigh(p);
            int m = p.get(k);
            long lastele = 1;
            for (Map.Entry entry : p.entrySet()) {
                if((long)entry.getKey()!=k){
                        lastele *= Math.pow((long) entry.getKey(), (int) entry.getValue());
                }
            }
            System.out.println(m);
            for(int i=0; i<m-1; i++){
                System.out.print(k+" ");
            }
            System.out.print(lastele*k+" ");
            System.out.println();
        }
    }

    private static long getHigh(HashMap<Long, Integer> p) {
        int hi = Integer.MIN_VALUE;
        long res = 0;
        for (Map.Entry entry : p.entrySet()) {
            if((int)entry.getValue()>hi){
                hi=(int)entry.getValue();
                res=(long)entry.getKey();
            }
        }
        return res;
    }
    // A O(log n) function returning primefactorization
    // by dividing by smallest prime factor at every step
    static HashMap<Long,Integer> getFactorization(long x)
    {
        HashMap<Long,Integer> ret = new HashMap<Long, Integer>();
        // Print the number of 2s that divide n
        int count = 0;

        // count the number of times 2 divides
        while (!(x % 2 > 0)) {
            // equivalent to n=n/2;
            x >>= 1;

            count++;
        }

        // if 2 divides it
        if (count > 0) {
            ret.put(2l,count);
        }

        // check for all the possible
        // numbers that can divide it
        for (long i = 3; i <= (long) Math.sqrt(x); i += 2) {
            count = 0;
            while (x % i == 0) {
                count++;
                x = x / i;
            }
            if (count > 0) {
                ret.put(i,count);
            }
        }

        // if n at the end is a prime number.
        if (x > 2) {
            ret.put(x,1);
        }

        return ret;
    }
}
