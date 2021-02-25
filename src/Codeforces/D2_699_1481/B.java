package Codeforces.D2_699_1481;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String[] st = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            int k = Integer.parseInt(st[1]);
            String[] s = reader.readLine().trim().split("\\s+");
            int p = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s[p++]);
            }
            int pos = 0;
            if(n==1){
                pos=-1;
            }else {
                while(k!=0) {
                    int i = 0;
                    while (i < n - 1) {
                        if (i == n - 2 && a[i] >= a[i + 1]) {
                            k--;
                            if (k == 0) {
                                pos = -1;
                            }
                            break;
                        } else if (a[i] >= a[i + 1]) {
                            i++;
                        } else if (a[i] < a[i + 1]) {
                            int dif = a[i + 1] - a[i];
                            a[i] += dif;
                            k = k - dif;
                            if (k == 0) {
                                pos = i + 1;
                            }
                            break;
                        }
                    }
                }
            }
            System.out.println(pos);
        }
    }
}
