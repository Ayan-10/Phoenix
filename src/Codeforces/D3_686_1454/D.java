package Codeforces.D3_686_1454;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
                    lastele *= (long) entry.getKey() * (long) entry.getValue();
                }
            }
            System.out.println(lastele);

        }
    }

    private static long getHigh(HashMap<Long, Integer> p) {
        int hi = Integer.MIN_VALUE;
        long res = 0;
        for (Map.Entry entry : p.entrySet()) {
            if((int)entry.getValue()>hi){
                res=(long)entry.getKey();
            }
        }
        return res;
    }

    static final long MAXN = 9999999999L;

    // stores smallest prime factor for every number
    static ArrayList<Long> spf =sieve();

    // Calculating SPF (Smallest Prime Factor) for every
    // number till MAXN.
    // Time Complexity : O(nloglogn)
    static ArrayList<Long> sieve()
    {
        spf.add(1, 1l);
        for (long i=2; i<MAXN; i++)

            // marking smallest prime factor for every
            // number to be itself.
            spf.add((int)i, i);

        // separately marking spf for every even
        // number as 2
        for (int i=4; i<MAXN; i+=2)
            spf.add(i, 2l);

        for (long i=3; i*i<MAXN; i++)
        {
            // checking if i is prime
            if (spf.get((int)i) == i)
            {
                // marking SPF for all numbers divisible by i
                for (long j=i*i; j<MAXN; j+=i)

                    // marking spf[j] if it is not
                    // previously marked
                    if (spf.get((int)j) ==j)
                        spf.set((int)j, i);
            }
        }
        return spf;
    }

    // A O(log n) function returning primefactorization
    // by dividing by smallest prime factor at every step
    static HashMap<Long,Integer> getFactorization(long x)
    {
        HashMap<Long,Integer> ret = new HashMap<Long, Integer>();
        while (x != 1)
        {
            if (ret.containsKey(spf.get((int)x))) {

                // If number is present in freqMap,
                // incrementing it's count by 1
                ret.put(spf.get((int)x), ret.get(spf.get((int)x)) + 1);
            }
            else {

                // If integer is not present in freqMap,
                // putting this integer to freqMap with 1 as it's value
                ret.put(spf.get((int)x), 1);
            }
            x = x / spf.get((int)x);
        }
        return ret;
    }
}
