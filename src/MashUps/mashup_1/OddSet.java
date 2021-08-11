package MashUps.mashup_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddSet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().trim().split("\\s+");
            int p = 0;
            int[] a = new int[2*n];
            for (int i = 0; i < 2*n; i++) {
                a[i] = Integer.parseInt(s[p++]);
            }
            int even = 0;
            int odd = 0;
            for(int i=0; i<a.length; i++){
                if(a[i]%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
            if(even==odd){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}