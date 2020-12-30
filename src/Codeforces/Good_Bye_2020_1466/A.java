package Codeforces.Good_Bye_2020_1466;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class A {
    public static void main(String[] args)throws IOException {
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
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    set.add(a[j]-a[i]);
                }
            }
            System.out.println(set.size());
        }
    }
}