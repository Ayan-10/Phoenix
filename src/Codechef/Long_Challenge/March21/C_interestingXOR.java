package Codechef.Long_Challenge.March21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_interestingXOR {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int a = Integer.parseInt(reader.readLine());
            int n = ((int)(Math.log(a) / Math.log(2) + 1));
            int b = 0;
            for(int i =0 ; i<n; i++){
                int bit = find(a,i);
                if(bit==0){
                    a=set(a,i);
                    b=set(b,i);
                }else {
                    if(i==n-1){

                    }else {
                        a = toggle(a,i);
                        b = set(b,i);
                    }
                }
            }
            System.out.println(a*b);
        }

    }

    private static int toggle(int a, int i) {
        return (a ^ (1 << i));
    }

    private static int set(int b, int i) {
        int mask = 1<<i;
        b = b|mask;
        return b;
    }

    private static int find(int a, int i) {
        int mask = 1<<i;
        int ans = a&mask;
        if(ans==0){
            return 0;
        }else{
            return 1;
        }
    }
}
