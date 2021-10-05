

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheOldSaintAndThreeQuestions {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String st[] = reader.readLine().trim().split("\\s+");
            int[] a = new int[3];
            for (int i = 0; i < 3; i++) {
                a[i] = Integer.parseInt(st[i]);
            }
            int ca1 = 0;
            int ca2 = 0;
            for (int i : a) {
                if(i == 1){
                    ca1++;
                } else if(i == 0){
                    ca2++;
                }
            }
            String[] s = reader.readLine().trim().split("\\s+");
            int[] b = new int[3];
            for (int i = 0; i < 3; i++) {
                b[i] = Integer.parseInt(s[i]);
            }
            int cb1 = 0;
            int cb2 = 0;
            for (int i : b) {
                if(i == 1){
                    cb1++;
                } else if(i == 0){
                    cb2++;
                }
            }

            if(ca1 == cb1 && cb2 == ca2){
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }            

    }
}
