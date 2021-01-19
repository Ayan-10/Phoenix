package Codeforces.D3_693_1472;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C {
    static int[] a;
    static int[] dp;
    static int n;
    static int f(int i){
        if(i>=n)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        return dp[i]= a[i]+f(i+a[i]);
    }
    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T;
            T = Integer.parseInt(br.readLine());
            while(T!=0){
                T--;
                n = Integer.parseInt(br.readLine());
                a = new int[n+1];
                dp = new int[n+1];
                String[] sa = br.readLine().split(" ");
                for(int i=0;i<n;i++){
                    a[i] = Integer.parseInt(sa[i]);
                    dp[i]=-1;
                }
                int res = -1;
                for(int i=0;i<n;i++){
                    if(dp[i]==-1){
                        dp[i]=f(i);
                    }
                    res = Integer.max(res,dp[i]);
                }
                System.out.println(res);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
