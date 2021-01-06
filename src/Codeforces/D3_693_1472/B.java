package Codeforces.D3_693_1472;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class B {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().trim().split("\\s+");
            int p = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s[p++]);
            }
            Stack<Integer> stack = new Stack<>();
            Arrays.sort(a);
            int i=n-1;
            int c1=0;
            int c2=0;
            while(i>=0){
                if(a[i]==2){
                    c2++;
                }else{
                    c1++;
                }
                i--;
            }
            if(c2%2!=0 && c1>1){
                c1=c1-2;
                c2=0;
            }
            if(c1%2==0 && c2%2==0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}