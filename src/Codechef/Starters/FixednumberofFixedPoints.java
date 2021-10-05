import java.io.*;

public class FixednumberofFixedPoints {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String st[] = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            int k = Integer.parseInt(st[1]);

            if(n == k+1 || n<k){
                System.out.println(-1);
            } else if (n == k){
                for (int i = 1; i <= n; i++) {
                    System.out.print(i+" ");
                }
                System.out.println();
            } else {
                int p = 1;
                int s = k;
                while(s != 0){
                    System.out.print(p+" ");
                    p++;
                    s--;
                }

                int q = p+1;
                while(q <= n){
                    System.out.print(q+" ");
                    q++;
                }
                System.out.print(p);
                System.out.println();
            }
            
        }
    }
}
