package Codeforces.Good_Bye_2020_1466;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class B {
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
            a[n-1]=a[n-1]+1;
            HashSet<Integer> set = new HashSet<>();

            for (int i = n - 1; i >= 1; i--) {
                if(a[i]-a[i-1]>1){
//                    System.out.print(a[i-1]+1+"yyyy ");
                    set.add(a[i-1]+1);
                    a[i-1]=a[i-1]+1;
                }else if(a[i]-a[i-1]<=1){
//                    System.out.print(a[i-1]+"gggg ");
//                    System.out.println();
                    set.add(a[i-1]);
                }
            }
            set.add(a[n-1]);
            System.out.println(set.size());
        }
    }
}