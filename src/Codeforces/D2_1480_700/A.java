package Codeforces.D2_1480_700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String s = reader.readLine();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<s.length(); i++){
                if((i & 1)==0){
                    if(s.charAt(i)=='a'){
                        sb.append('b');
                    }else {
                        sb.append("a");
                    }
                }else {
                    if(s.charAt(i)=='z'){
                        sb.append('y');
                    }else {
                        sb.append("z");
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}
