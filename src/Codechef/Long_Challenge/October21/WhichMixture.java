import java.io.*;
import java.util.*;

public class WhichMixture {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- >0){
            String[] st = reader.readLine().trim().split("\\s+");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);

            if(a==0){
                System.out.println("Liquid");
            } else if(b==0){
                System.out.println("Solid");
            } else {
                System.out.println("Solution");
            }
        }
    }
}