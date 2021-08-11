package MashUps.mashup_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class MEX {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());

            String s = reader.readLine();
            System.out.println(ShortestSubsequenceNotPresent(s));
        }
    }
    public static String
    ShortestSubsequenceNotPresent(String str)
    {
        String shortestString = "";

        int N = str.length();

        HashSet<Character> subsegments = new HashSet<>();

        for (int i = 0; i < N; i++) {

            subsegments.add(str.charAt(i));

            if (subsegments.size() == 26) {

                shortestString = shortestString + str.charAt(i);

                subsegments.clear();
            }
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!subsegments.contains(ch)) {
                shortestString = shortestString + ch;

                return shortestString;
            }
        }
        return shortestString;
    }
}
