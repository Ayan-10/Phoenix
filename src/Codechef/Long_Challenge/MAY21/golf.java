package Codechef.Long_Challenge.MAY21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class golf {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String[] st = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            int x = Integer.parseInt(st[1]);
            int k = Integer.parseInt(st[2]);

            if(x%k == 0){
                System.out.println("YES");
            }else if(((n+1) - x)%k==0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}