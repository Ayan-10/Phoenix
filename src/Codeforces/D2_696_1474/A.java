package Codeforces.D2_696_1474;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String st[] = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            String a = reader.readLine();
            int prev = -1;
            StringBuilder b = new StringBuilder();
            for (int i=0; i<n; i++){
               int c = Integer.parseInt(String.valueOf(a.charAt(i)));
               if(c+1==prev){
                   b.append('0');
                   prev=c+0;
               }else{
                  b.append('1');
                   prev=c+1;
               }
            }
            System.out.println(b.toString());
        }
    }
}