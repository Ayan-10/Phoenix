

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HardestProblemBet {
    public static void main(String[] args)  throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String st[] = reader.readLine().trim().split("\\s+");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            int c = Integer.parseInt(st[2]);

            if (c<b && c<a) {
                System.out.println("Alice");
            } else if(b<c && b<a) {
                System.out.println("Bob");
            } else if(a<b && a<c) {
                System.out.println("Draw");
            }
        }
    }
}
