package Codeforces.D3_686_1454;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class C {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- >0){
            int n = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().trim().split("\\s+");
            int p =0;
            int[] a = new int[n];
            for (int i=0; i<n; i++){
                a[i]= Integer.parseInt(s[p++]);
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i=0; i<n; i++){
                boolean maja = i + 1 < n && a[i] != a[i + 1];
                if(map.containsKey(a[i])){
                    int c = 0;
                    if(maja){
                        c++;
                    }
                    map.put(a[i],map.get(a[i])+c);
                }else{
                    int c=0;
                    if(i-1>-1 && a[i-1]!=a[i]){
                        c++;
                    }
                    if(maja){
                        c++;
                    }
                    map.put(a[i],c);
                }
            }
            int hi = Integer.MAX_VALUE;
            for (Map.Entry entry : map.entrySet()) {
                if((int)entry.getValue()<hi){
                    hi=(int)entry.getValue();
                }
            }
            System.out.println(hi);
        }
    }
}
