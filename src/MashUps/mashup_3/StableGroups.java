package MashUps.mashup_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StableGroups {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String[] s = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(s[0]);
            int a = Integer.parseInt(s[1]);
            int b = Integer.parseInt(s[2]);
            int c = Integer.parseInt(s[3]);

            System.out.println(1+" "+1+" "+n+" "+a);

        }
    }
}
