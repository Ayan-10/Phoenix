package Codechef.Lunch.June21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class binarData {
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
            ArrayList<Integer> eve = new ArrayList<>();
            ArrayList<Integer> od = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if(a[i]%2==0){
                    eve.add(a[i]);
                }
                {
                    od.add(a[i]);
                }
            }
            int e =0;
            int o = 0;
            boolean f = false;
            for (int i = 0; i < n; i++) {
                if(!f){
                    if(eve.size()!=0) {
                        a[i] = eve.get(e);
                        e++;
                    }
                    f = true;
                } else {
                    if(od.size()!=0) {
                        a[i] = od.get(o);
                        o++;
                    }
                    f = false;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
