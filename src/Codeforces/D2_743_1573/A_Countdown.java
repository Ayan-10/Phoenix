/**
 * A_Countdown
 */
import java.io.*;

public class A_Countdown {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            String s = reader.readLine();
            int sum = 0;
            int count = 0;
            for(int i=0; i<s.length(); i++){
                if(Integer.parseInt(String.valueOf(s.charAt(i))) != 0){
                    if(i<n-1){
                    count++;
                    }
                    sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
                }
            }
            System.out.println(count+sum);
        }
    }
}