package Codeforces.D2_694_1471;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
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
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s[p++]);
            }
            int min = Integer.MAX_VALUE;
            int j=-1;
            for (int i = 0; i < n; i++) {
                if(a[i]%m!=0){
                   min=0;
                }else{
                    int q=a[i];
                    int c=0;
                    while(q%m==0){
                        c++;
                        q=q/m;
                    }
                    if(c<min){
                        min=c;
                        j=i;
                    }
                }
            }
            int sum=0;
            for (int i = 0; i < n; i++) {
                sum+=a[i];
            }
            int i=0;
            while(i>-1 && i<j){
                int x = a[i];
                int c=1;
                int w=m;
                while(x%m==0 && min+1>=c){
                    x=x/m;
                    for(int y=0; y<w; y++){

                        sum+=x;

                    }
                    w=w*w;
                    c++;
                }
                i++;
            }
            while(i>-1 && j<n){
                int x=a[j];
                int c=1;
                int w=m;
                while(x%m==0 && min>=c){
                    x=x/m;
                    for(int y=0; y<w; y++){
                        sum+=x;
                    }
                    w=w*w;
                    c++;
                }
                j++;
            }
            System.out.println(sum);
        }
    }
}