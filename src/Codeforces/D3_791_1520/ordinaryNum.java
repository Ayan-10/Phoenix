package Codeforces.D3_791_1520;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ordinaryNum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            long n = Long.parseLong(reader.readLine());
            int sum = 0;
            int digit = (int) (Math.log10(n)+1);

            if(n<10){
                sum += n;
            }else {
                sum+=9;
                int div = 1;
                for(int i = 1; i<digit; i++){
                    div = div*10+1;
                }
                sum+=n/div;
                digit-=1;
                int i = digit;
                if (i > 1) {
                    sum+=9*(i-1);
                }
            }
            System.out.println(sum);
        }
    }
}
