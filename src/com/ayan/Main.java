package com.ayan;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- >0){
            String st[] = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            //int V = Integer.parseInt(st[1]);
            String s[] = reader.readLine().trim().split("\\s+");
            int p =0;
            int a[] = new int[n];
            for (int i=0; i<n; i++){
                a[i]= Integer.parseInt(s[p++]);
            }

            int j=0;
            for (int i=0; i<n; i++){
                if(a[i]>3){
                    if(a[i]>4){
                        j=i;
                        break;
                    }
                }
                System.out.println(i);
            }


        }
    }
}
