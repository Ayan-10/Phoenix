package com.ayan;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- >0){
//            String st[] = reader.readLine().trim().split("\\s+");
//            int n = Integer.parseInt(st[0]);
//            //int V = Integer.parseInt(st[1]);
//            String s[] = reader.readLine().trim().split("\\s+");
//            int p =0;
//            int n = 6;
//            ArrayList<Integer> a = new ArrayList<>();
//            a.add(4);
//            a.add(2);
//            a.add(5);
//            a.add(3);
//            a.add(6);
//            a.add(1);
//            a.remove(3);
//            if(a.size()>5) {
//                a.remove(5);
//            }
            String s = "ousdh,,ojf,,kjd,fjfw,jdfjk";
            String[] a = s.split(",");
            for(String p : a){
                System.out.println(p);
            }
        }
    }
}
