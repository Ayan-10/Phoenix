package Codeforces.D3_702_1490;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_sumofCubes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            long n = Long.parseLong(reader.readLine());
            int q = (int)cubicRoot(n);
            long[] ar = new long[q+1];
            for (int i=1; i<=q; i++) {
                ar[i]=i*i*i;
            }
            boolean f= sum(ar,n,q);
            if (f) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static boolean sum(long[] A, long n, int q) {
        int l = 0;
        int r = q;
        while (l <= r) {
            if (A[l] + A[r] == n)
                return true;
            else if (A[l] + A[r] < n)
                l++;
            else // A[i] + A[j] > sum
                r--;
        }
        return false;
    }

    static double diff(double n,double mid)
    {
        if (n > (mid*mid*mid))
            return (n-(mid*mid*mid));
        else
            return ((mid*mid*mid) - n);
    }

    // Returns cube root of a no n
    static double cubicRoot(double n)
    {
        // Set start and end for binary search
        double start = 0, end = n;

        // Set precision
        double e = 0.0000001;

        while (true)
        {
            double mid = (start + end)/2;
            double error = diff(n, mid);

            // If error is less than e then mid is
            // our answer so return mid
            if (error <= e)
                return mid;

            // If mid*mid*mid is greater than n set
            // end = mid
            if ((mid*mid*mid) > n)
                end = mid;

                // If mid*mid*mid is less than n set
                // start = mid
            else
                start = mid;
        }
    }
}