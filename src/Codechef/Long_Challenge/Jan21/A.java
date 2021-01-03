package Codechef.Long_Challenge.Jan21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- >0){
            String st[] = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            int k = Integer.parseInt(st[1]);
            int d = Integer.parseInt(st[2]);
            String s[] = reader.readLine().trim().split("\\s+");
            int p =0;
            int a[] = new int[n];
            for (int i=0; i<n; i++){
                a[i]= Integer.parseInt(s[p++]);
            }
            int sum=0;
            for (int i=0; i<n; i++){
               sum += a[i];
            }
            int res = sum/k;
            if(res>d){
                System.out.println(d);
            }else {
                System.out.println(res);
            }
        }
    }
}
