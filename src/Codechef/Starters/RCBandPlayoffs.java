import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RCBandPlayoffs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String st[] = reader.readLine().trim().split("\\s+");
            int x = Integer.parseInt(st[0]);
            int y = Integer.parseInt(st[1]);
            int z = Integer.parseInt(st[2]);

            if(x>=y){
                System.out.println("Yes");
            } else {
                int r = y - x;
                if(z*2 >= r){
                    System.out.println("Yes"); 
                } else {
                    System.out.println("No");    
                }
            }
        }
    }
}
