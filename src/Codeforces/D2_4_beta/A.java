package Codeforces.D2_4_beta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
       if((t&1)==0 && t>2){
           System.out.println("YES");
       }else {
           System.out.println("NO");
       }
    }
}