package Codeforces.D2_113_1569;

import java.io.*;

/**
 * A._BalancedSubstring
 */
public class A_BalancedSubstring {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String st[] = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            String s = reader.readLine();
            int i = s.indexOf("ab");
            if(i==-1){
                i = s.indexOf("ba");
            }

            if(i==-1){
                System.out.println(-1+" "+-1);
            } else {
                System.out.println((i+1)+" "+(i+2));
            }

        }
    }
}