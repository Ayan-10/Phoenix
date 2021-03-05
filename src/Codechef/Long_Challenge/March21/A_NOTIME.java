package Codechef.Long_Challenge.March21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_NOTIME {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String st[] = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            int h = Integer.parseInt(st[1]);
            int x = Integer.parseInt(st[2]);
            String[] s = reader.readLine().trim().split("\\s+");
            int p = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s[p++]);
            }
        if(h<=x){
                System.out.println("yes");
            }else {
            boolean f = false;
            for (int i = 0; i < n; i++) {
                    if (a[i] + x >= h) {
                        f = true;
                        break;
                    }
                }
            if(f){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
            }
    }
}