package Codechef.Long_Challenge.Jan21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String st[] = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);
            String s[] = reader.readLine().trim().split("\\s+");
            int p = 0;
            int a[] = new int[n];
            int b[] = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s[p++]);
            }
            String s1[] = reader.readLine().trim().split("\\s+");
            int q=0;
            for (int i = 0; i < m; i++) {
                b[i]= Integer.parseInt(s1[q++]);
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int suma=0;
            int sumb=0;
            for (int i = 0; i < n; i++) {
                suma+=a[i];
            }
            for (int i = 0; i < m; i++) {
                sumb+=b[i];
            }
            int ans=0;
            if(sumb>=suma){
               int jh=0;
               int jk=m-1;
               while(jk>=0 && jh<n && suma<=sumb){
                   int x= a[jh];
                   int y= b[jk];
                   suma=(suma-x)+y;
                   sumb=(sumb-y)+x;
                   ans++;
                   jh++;
                   jk--;
               }
            }
            if(suma>sumb){
                System.out.println(ans);
            }else {
                System.out.println(-1);
            }
        }
    }
}