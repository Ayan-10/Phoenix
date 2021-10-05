import java.io.*;
import java.util.*;

public class LongestandSubarray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- >0){
            int n = Integer.parseInt(reader.readLine());
            if( n == 1){
                System.out.println(1);
            } else {

                for(int i = 1; i< Integer.MAX_VALUE; i++){

                    if( ((int) Math.pow(2, i)) <= n && ((int) Math.pow(2, i+1) - 1) >= n){

                        if( ((int) Math.pow(2, i))/2 > n - (int) Math.pow(2, i) + 1 ){
                            System.out.println(((int) Math.pow(2, i))/2);
                        } else {
                            System.out.println(n - (int) Math.pow(2, i) + 1);
                        }
                        break;
                    }
                }
            }
        }
    }
}
