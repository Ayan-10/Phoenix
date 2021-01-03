package Codeforces.D2_681_1443;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String st[] = reader.readLine().trim().split("\\s+");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            String s = reader.readLine();
            int p=0;
            int q=0;
            int c=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='1'){
                    p=i;
                    c++;
                    break;
                }
            }
            for(int i = s.length() - 1; i >= 0; i--){
                if(s.charAt(i)=='1'){
                    q=i;
                    c++;
                    break;
                }
            }
            int z=0;
            for(int i = p+1; i < q; i++){
                if(s.charAt(i)=='1'){
                   c++;
                }else {
                   z++;
                }
            }
            System.out.println(Math.min((b*z)+a,a*c));

        }
    }
}