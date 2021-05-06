package Codeforces.D3_791_1520;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class DoNotBeDistracted {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            String str = reader.readLine();

            HashSet<Character> h = new HashSet<>();

            boolean f = false;
            char prev = str.charAt(0);
            for(int i=1; i<n; i++){
                if(h.contains(str.charAt(i))){
                    f = true;
                    break;
                }else{
                    if(prev != str.charAt(i)){
                        h.add(prev);
                    }
                    prev = str.charAt(i);
                }
            }
            if(f){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}