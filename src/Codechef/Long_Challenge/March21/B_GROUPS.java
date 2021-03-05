package Codechef.Long_Challenge.March21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_GROUPS {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int count = 0;
            String s = reader.readLine();
            int i=0;
            for(; i<s.length(); i++){
                if(s.charAt(i)=='1'){
                    while (i<s.length()) {
                        if(s.charAt(i)=='0'){
                            break;
                        }
                        i++;
                    }
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}
