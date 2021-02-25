package Codeforces.D2_1480_700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().trim().split("\\s+");
            int p = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s[p++]);
            }
            int a1=1;
            int a2=0;
            int c=0;
            for(int i=1; i<n; i++){
                if(a[i-1]!=a[i]){
                    a1++;
                    c=0;
                }else if(a[i-1]==a[i]){
                    c++;
                    if(c<2){
                        a2++;
                    }
                }
            }
            System.out.println(a1+a2);

    }
}
