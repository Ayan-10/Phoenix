package Codechef.Lunch.August21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * MaxLenEvenSum
 */
public class MaxLenEvenSum {

    public static void main(String[] args) throws  IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            if(n==2){
                System.out.println(2);
            } else {
                int sum = (n * (n+1))/2;
                if (sum % 2 != 0) {
                    System.out.println(n-1);  
                } else {
                    System.out.println(n);
                }
            }
        }
    }
}