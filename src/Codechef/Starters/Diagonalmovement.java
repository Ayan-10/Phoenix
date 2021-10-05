import java.io.*;

public class Diagonalmovement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String st[] = reader.readLine().trim().split("\\s+");
            int x = Integer.parseInt(st[0]);
            int y = Integer.parseInt(st[1]);

            if(Math.abs(x) == Math.abs(y)){
                System.out.println("yes");
            } else if((Math.abs(x) - Math.abs(y)) % 2 == 0){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
