package Codeforces.D2_694_1471;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int t=0;t<T;t++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            List<long[]> a=new ArrayList<>();
            for(int i=0;i<n;i++){
                a.add(new long[]{sc.nextInt(),1});
            }
            long sum=0;
            boolean flag=true;
            for(int i=0;i<a.size();i++){
                if(flag && a.get(i)[0]%x!=0){
                    flag=false;
                }

                sum+=a.get(i)[0]*a.get(i)[1];
                if(flag){
                    a.add(new long[]{a.get(i)[0]/x,a.get(i)[1]*x});
                }
            }

            sb.append(sum+"\n");
        }
        System.out.print(sb.toString());
    }
}