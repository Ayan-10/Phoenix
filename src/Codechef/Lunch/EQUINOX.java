package Codechef.Lunch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EQUINOX {
    public static void main (String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            final String STR = "EQUINOX";
            int t = Integer.parseInt(reader.readLine());
            while (t-- > 0) {
                String st[] = reader.readLine().trim().split("\\s+");
                int n = Integer.parseInt(st[0]);
                long a = Integer.parseInt(st[1]);
                long b = Integer.parseInt(st[2]);
                long SARTHAK = 0;
                long ANURADHA = 0;
                while(n-->0){
                    String s = reader.readLine();
                    if (STR.indexOf(s.charAt(0))>=0) {
                        SARTHAK+=a;
                    }else {
                        ANURADHA+=b;
                    }
                }
                
                if(SARTHAK > ANURADHA){
                    System.out.println("SARTHAK");
                }else if(SARTHAK < ANURADHA){
                    System.out.println("ANURADHA");
                }else {
                    System.out.println("DRAW");
                }
            }
        } catch(Exception e) {
        } finally {
        }
    }
}