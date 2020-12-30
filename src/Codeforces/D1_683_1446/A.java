package Codeforces.D1_683_1446;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String st[] = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            int w = Integer.parseInt(st[1]);
            String[] s = reader.readLine().trim().split("\\s+");
            int p = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s[p++]);
            }
            ArrayList<Integer> ans =new ArrayList<>();
            long sum=0;
            int i = 0;
            while (i < n) {
                if(sum+a[i]>w){
                    i++;
                }else if(a[i]+sum>=(w/2) && a[i]+sum<=w){
                    sum+=a[i];
                    ans.add(i+1);
                    break;
                }else if(a[i]+sum<(w/2)){
                    sum+=a[i];
                    ans.add(i+1);
                    i++;
                }
            }
            if(sum>0){
                System.out.println(ans.size());
                for(int j=0; j<ans.size(); j++){
                    System.out.print(ans.get(j)+" ");
                }
                System.out.println();
            }else{
                System.out.println(-1);
            }
        }
    }
}