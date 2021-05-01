package Codechef.Lunch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class imdb {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String st[] = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            int x = Integer.parseInt(st[1]);
            int s[] = new int[n];
            int r[] = new int[n];
            for (int i = 0; i < n; i++) {
                String str[] = reader.readLine().trim().split("\\s+");
                s[i] = Integer.parseInt(str[0]);
                r[i] = Integer.parseInt(str[1]);
            }
            int max = -1;
            for(int i = 0; i<n; i++){
                if(s[i]<=x){
                    if(r[i]>=max){
                        max = r[i];
                    }
                }
            }
            System.out.println(max);
        }
    }
}