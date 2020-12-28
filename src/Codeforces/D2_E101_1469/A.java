package Codeforces.D2_E101_1469;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- >0){
            String s = reader.readLine();
            int i=0;
            int e = 0;
            boolean f = false;

            int fb=0;
            int lb=0;
            while(i<s.length()){
                if(s.charAt(i)=='('){
                    fb++;
                    int u=0;
                    int v=0;
                    for(int j=i; j<s.length(); j++){
                        if(s.charAt(j)=='('){
                            v++;
                        }else{
                            u++;
                        }
                    }
                    if(u<v){
                       f=true;
                       break;
                    }
                }else if(s.charAt(i)==')'){
                    lb++;
                    int u=0;
                    int v=0;
                    for(int j=i; j>=0; j--){
                        if(s.charAt(j)==')'){
                            v++;
                        }else{
                            u++;
                        }
                    }
                    if(u<v){
                        f=true;
                        break;
                    }
                }else{
                    e++;
                }
                i++;
            }
            if(f){
                System.out.println("no");
            }else{
                int w = Math.max(fb,lb)-Math.min(fb,lb);
                if(w==e){
                    System.out.println("yes");
                }else if(w>e){
                    System.out.println("no");
                }else{
                    int res=Math.max(w,e)-Math.min(w,e);
                    if(res%2==0){
                        System.out.println("yes");
                    }else {
                        System.out.println("no");
                    }
                }
            }

        }
    }
}
