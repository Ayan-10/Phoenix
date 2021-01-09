package Codeforces.D3_693_1472;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class D {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().trim().split("\\s+");
            int p = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s[p++]);
            }
            Arrays.sort(a);
            int ali=0;
            int bob =0;
            boolean f=false;
            for(int i = n - 1; i >= 0; i--){
                if(!f){
                    if(a[i]%2==0) {
                        ali += a[i];
                    }
                    f=true;
                }else{
                    if(a[i]%2!=0) {
                        bob += a[i];
                    }
                    f=false;
                }
            }
            if(ali>bob){
                System.out.println("Alice");
            }else if(bob>ali){
                System.out.println("Bob");
            }else{
                System.out.println("Tie");
            }
        }
    }
}