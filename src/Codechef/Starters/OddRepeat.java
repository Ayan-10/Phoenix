

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddRepeat {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String st[] = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            int k = Integer.parseInt(st[1]);
            int s = Integer.parseInt(st[2]);

            int count = 0;
            int i = 1;
            int sum = 0;
            while(count<n){
                sum += i;
                i+=2;
                count++;
            }
            int res = s - sum;
            int c = 0;
            int ans = 0;
           
            for (int j = 1; c < n; j = j +2) {
                if(res%j==0 && res/j==(n+k-1)-n){
                    ans = j;
                    break;
                }
                c++;
            }
            System.out.println(ans);
        }
    }
}
