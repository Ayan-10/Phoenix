package MashUps.mashup_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayReordering {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {

            int n = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().trim().split("\\s+");
            int q = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=Integer.parseInt(s[q++]);
            }
            int[] arr =new int[n];
            int p=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]%2==0){
                    arr[p]=a[i];
                    p++;
                }

            }
            for(int i=0;i<n;i++)
            {
                if(a[i]%2!=0){
                    arr[p]=a[i];
                    p++;
                }

            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                for(int j=i+1; j<n; j++) {
                    if(gcd(arr[i],2*arr[j])>1){
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
