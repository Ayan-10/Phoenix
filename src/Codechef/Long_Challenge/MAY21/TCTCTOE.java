package Codechef.Long_Challenge.MAY21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TCTCTOE {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            char[] a = new char[3];
            char[] b = new char[3];
            char[] c = new char[3];
            int p = 0;
            int q = 0;
            int r = 0;

            String[] st1 = reader.readLine().trim().split("\\s+");
            String s = st1[0];
            for(int j = 0; j<3; j++) {
                a[p++] = s.charAt(j);
            }
            String[] st2 = reader.readLine().trim().split("\\s+");
            String s1 = st2[0];
            for(int j = 0; j<3; j++) {
                b[q++] = s1.charAt(j);
            }
            String[] st3 = reader.readLine().trim().split("\\s+");
            String s2 = st3[0];
            for(int j = 0; j<3; j++) {
                c[r++] = s2.charAt(j);
            }
            int x = 0;
            int o = 0;
            int u = 0;
            for(int i=0; i<3; i++) {
                    if(a[i] == 'X'){
                        x++;
                    }else if(a[i] == 'O'){
                        o++;
                    }else if(a[i] == '_'){
                        u++;
                    }
            }
            for(int i=0; i<3; i++) {
                if(b[i] == 'X'){
                    x++;
                }else if(b[i] == 'O'){
                    o++;
                }else if(b[i] == '_'){
                    u++;
                }
            }
            for(int i=0; i<3; i++) {
                if(c[i] == 'X'){
                    x++;
                }else if(c[i] == 'O'){
                    o++;
                }else if(c[i] == '_'){
                    u++;
                }
            }
            int awon=0;
            int bwon=0;
            if(a[0]=='X'&&a[1]=='X'&&a[2]=='X')
                awon=1;
            if(b[0]=='X'&&b[1]=='X'&&b[2]=='X')
                awon=1;
            if(c[0]=='X'&&c[1]=='X'&&c[2]=='X')
                awon=1;
            if(a[0]=='X'&&b[1]=='X'&&c[2]=='X')
                awon=1;
            if(a[2]=='X'&&b[1]=='X'&&c[0]=='X')
                awon=1;
            if(a[0]=='X'&&b[0]=='X'&&c[0]=='X')
                awon=1;
            if(a[1]=='X'&&b[1]=='X'&&c[1]=='X')
                awon=1;
            if(a[2]=='X'&&b[2]=='X'&&c[2]=='X')
                awon=1;


            if(a[0]=='O'&&a[1]=='O'&&a[2]=='O')
                bwon=1;
            if(b[0]=='O'&&b[1]=='O'&&b[2]=='O')
                bwon=1;
            if(c[0]=='O'&&c[1]=='O'&&c[2]=='O')
                bwon=1;
            if(a[0]=='O'&&b[1]=='O'&&c[2]=='O')
                bwon=1;
            if(a[2]=='O'&&b[1]=='O'&&c[0]=='O')
                bwon=1;
            if(a[0]=='O'&&b[0]=='O'&&c[0]=='O')
                bwon=1;
            if(a[1]=='O'&&b[1]=='O'&&c[1]=='O')
                bwon=1;
            if(a[2]=='O'&&b[2]=='O'&&c[2]=='O')
                bwon=1;


            if((awon==1 && bwon==1)||((x-o)<0)||((x-o)>1)){
                System.out.println(3);
            }else if(x==0 && o==0 && u==9){
                System.out.println(2);
            }else if(awon==1 && bwon==0 && x>o){
                System.out.println(1);
            }else if(awon==0 && bwon==1 && x==o){
                System.out.println(1);
            }else if(awon==0 && bwon==0 && u==0){
                System.out.println(1);
            }else if(awon==0 && bwon==0 && u>0){
                System.out.println(2);
            }else {
                System.out.println(3);
            }
        }
    }
}
