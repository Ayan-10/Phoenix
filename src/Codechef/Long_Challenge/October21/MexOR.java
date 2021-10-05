import java.io.*;

public class MexOR {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- >0){
            int n = Integer.parseInt(reader.readLine());

            if( n == 0){
                System.out.println(1);
            } else {

                int val = 0;

                for(int i = 1; i< Integer.MAX_VALUE; i++){

                    if( (Math.pow(2, i))-1 > n ){
                        break;
                    } else {
                        val += Math.pow(2, i-1);
                    }
                }

                System.out.println(val+1);
            }

        }
    }
}
