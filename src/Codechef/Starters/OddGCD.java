import java.io.*;

public class OddGCD {
    public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(reader.readLine());
            while (t-- > 0) {
                String st[] = reader.readLine().trim().split("\\s+");
                int n = Integer.parseInt(st[0]);
                String[] s = reader.readLine().trim().split("\\s+");
                int p = 0;
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = Integer.parseInt(s[p++]);
                }

                int odd = 0, even = 0;

                for (int i : a) {
                    if(i%2==0){
                        even++;
                    }else{
                        odd++;
                    }
                }

                if(odd != 0){
                    System.out.println(0);
                } else {
                    int res = Integer.MAX_VALUE;
                    for(int i=0; i<n; i++){
                        int ans = 0;
                        while(a[i]%2 != 1){
                            a[i] = a[i] / 2;
                            ans++;
                        }

                        if(ans<res){
                            res = ans;
                        }
                    }
                    System.out.println(res);

                }
            }
    }
}
