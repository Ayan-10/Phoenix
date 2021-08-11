package MashUps.mashup_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusandMultiply {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String[] s = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(s[0]);
            int a = Integer.parseInt(s[1]);
            int b = Integer.parseInt(s[2]);

            int x = 1;
            System.out.println(solve(1, n, a, b));

        }
    }

    private static boolean solve(int x, int n, int a, int b) {

        if(x==n){
            return true;
        } else if(x<n) {
            return solve(x * a, n, a, b) || solve(x + b, n, a, b);
        } else {
            return false;
        }
    }
}
