package Codechef.Lunch.June21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubGridTicTacToe {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String[] st = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);
            int k = Integer.parseInt(st[2]);

            int[][] a = new int [n*m][2];
            for(int i =0; i<n*m; i++){
                String[] s = reader.readLine().trim().split("\\s+");
                a[i][0] = Integer.parseInt(s[0]);
                a[i][1] = Integer.parseInt(s[1]);
            }



        }
    }
}
