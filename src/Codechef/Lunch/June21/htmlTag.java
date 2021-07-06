package Codechef.Lunch.June21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class htmlTag {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String s = reader.readLine();
            if(s.charAt(0)=='<'&& s.charAt(1)=='/' && s.charAt(s.length()-1)=='>'){
                if(s.length()==3){
                    System.out.println("Error");
                } else {
                    boolean fb = false;
                    for (int i = 2; i < s.length() - 1; i++) {
                        char tes = s.charAt(i);
                        if (!Character.isLowerCase(tes) && !Character.isDigit(tes)){
                            fb = true;
                            break;
                        }
                    }
                    if(fb){
                        System.out.println("Error");
                    }else {
                        System.out.println("Success");
                    }
                }
            }else{
                System.out.println("Error");
            }
        }
    }
}
