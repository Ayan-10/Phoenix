package MashUps.mashup_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrtyPermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = i+1;
            }
            if(n%2==0){
                for(int i=0; i<n-1; i=i+2){
                    int tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                }
            }else{
                if(n>1) {
                    for(int i=0; i<n-2; i=i+2){
                        int tmp = a[i];
                        a[i] = a[i+1];
                        a[i+1] = tmp;
                    }

                    int tmp = a[n - 1];
                    a[n - 1] = a[n - 3];
                    a[n - 3] = tmp;
                }
            }
            for(int i=0; i<n; i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
