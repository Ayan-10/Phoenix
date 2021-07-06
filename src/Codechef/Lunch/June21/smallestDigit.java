package Codechef.Lunch.June21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class smallestDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String d = reader.readLine();
            int n = d.length();

            String ans;
            if(d.charAt(0)=='1'){
                ans = "10" +d.substring(1, n);
            }else{
                ans = '1'+d.substring(0,n);
            }

            System.out.println(ans);
        }
    }
}
