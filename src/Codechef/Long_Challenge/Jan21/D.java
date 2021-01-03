package Codechef.Long_Challenge.Jan21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String st[] = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            int k = Integer.parseInt(st[1]);
            int x = Integer.parseInt(st[2]);
            int y = Integer.parseInt(st[3]);
            String[] s = new String[4];
            if(x==y){
                System.out.println(n+" " +n);
            }else{
                if (x<y){
                    s[0]=(x+n-y)+ " " +  n;
                    s[1]=n + " " +(n-y+x);
                    s[2]=(y-x)+ " " +  0;
                    s[3]=0+ " " +  (y-x);

                }else {
                    s[0]=n+ " " +  (y+n-x);
                    s[1]=(y+n-x) + " " +n;
                    s[2]=0+ " " +  (x-y);
                    s[3]=(x-y)+ " " +  0;
                }
                System.out.println(s[(k-1)%4]);
            }
        }
    }
}
