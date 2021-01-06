package Codeforces.D3_693_1472;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String st[] = reader.readLine().trim().split("\\s+");
            int w = Integer.parseInt(st[0]);
            int h = Integer.parseInt(st[1]);
            int n = Integer.parseInt(st[2]);
            int num =1;
            while(w%2==0 && num<n){
                w/=2;
                num=num*2;
            }
            while(h%2==0 && num<n){
                h/=2;
                num=num*2;
            }
            if(num>=n){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}