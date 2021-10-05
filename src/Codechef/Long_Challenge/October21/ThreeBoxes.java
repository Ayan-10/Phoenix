import java.io.*;
import java.util.*;

public class ThreeBoxes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- >0){
            String[] st = reader.readLine().trim().split("\\s+");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            int c = Integer.parseInt(st[2]);
            int d = Integer.parseInt(st[3]);

            if(a+b+c <= d){
                System.out.println(1);
            } else if(a+c <= d){
                System.out.println(2);
            } else if(a+b <= d){
                System.out.println(2);
            } else if (a+b+c > d){
                System.out.println(3);
            }
            
        }
    }
}
