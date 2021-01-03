package Codechef.Long_Challenge.Jan21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
    static final String ms = "abcdefghijklmnop";
    public static void main(String[] args)throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- >0){
            int n = Integer.parseInt(reader.readLine());
            String s = reader.readLine();
            int c=0;
            int ans = 16;
            int fst = 16;
            StringBuilder str = new StringBuilder();
            for (int i=0; i<n; i++){
                char ch = s.charAt(i);
                if(ch=='0'){
                    ans=ans-(fst/2);
                    fst=fst/2;
                }else{
                    fst=fst/2;
                }
                c++;
                if(c==4){
                    str.append(ms.charAt(ans-1));
                    c=0;
                    fst=16;
                    ans=16;
                }
            }
            System.out.println(str.toString());
}
    }
    }
