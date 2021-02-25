package Codeforces.D2_65_beta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            StringBuilder sb = new StringBuilder();
            String s = reader.readLine();
            if (s.length()>10){
                sb.append(s.charAt(0));
                int st = s.substring(1,s.length()-1).length();
                sb.append(Integer.valueOf(st));
                sb.append(s.charAt(s.length()-1));
                System.out.println(sb.toString());
            }else {
                System.out.println(s);
            }

        }
    }
}
