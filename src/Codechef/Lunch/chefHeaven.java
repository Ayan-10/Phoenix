package Codechef.Lunch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chefHeaven {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());

            String s = reader.readLine();
            int i = 0;
            int zero = 0;
            int one = 0;
            boolean f = false;
            while(i<n){
                if(s.charAt(i)=='0'){
                    zero++;
                }else if (s.charAt(i)=='1'){
                    one++;
                }

                if(one == zero){
                    f = true;
                    break;
                }
                i++;
            }
            if(f){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
