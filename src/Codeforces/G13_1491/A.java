package Codeforces.G13_1491;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] st = reader.readLine().trim().split("\\s+");
        int n = Integer.parseInt(st[0]);
        int q = Integer.parseInt(st[1]);
        String[] s = reader.readLine().trim().split("\\s+");
        int p = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(s[p++]));
        }
        while (q-- > 0) {
            String[] str = reader.readLine().trim().split("\\s+");
            int x = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            if(x==1){
                a.set(k-1,1-a.get(k-1));
            }else {
                ArrayList<Integer> arr = new ArrayList<>();
                arr.addAll(a);
                Collections.sort(arr);
                System.out.println(arr.get(arr.size()-k));
            }

        }
    }
}
