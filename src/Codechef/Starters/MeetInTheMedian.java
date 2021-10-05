

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MeetInTheMedian {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String st[] = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            int k = Integer.parseInt(st[1]);
            String[] s = reader.readLine().trim().split("\\s+");
            int p = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s[p++]);
            }

            Arrays.sort(a);
            int in = n-((k/2)+1);
            int med = a[in];
            System.out.println(med);
            if(k%2==0){
                int i = in+1; 
                while(i<n){
                    System.out.print(a[i]+" ");
                    i++;
                }
                int j = in-1;
                int req = 1;
                while(j>=0 && req<=((k/2)-1) ){
                    System.out.println(a[j]);
                    j--;
                    req++;
                    System.out.println();
                }
            }else{
                int i = in+1; 
                while(i<n){
                    System.out.print(a[i]+" ");
                    i++;
                }
                int j = in-1;
                int req = 1;
                while(j>=0 && req<=((k/2)) ){
                    System.out.println(a[j]);
                    j--;
                    req++;
                }
                System.out.println();
            }

        }
    }
}
