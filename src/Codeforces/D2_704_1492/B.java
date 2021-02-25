package Codeforces.D2_704_1492;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().trim().split("\\s+");
            int p = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= Integer.parseInt(s[p++]);
            }

            Stack<Integer> st = new Stack<>();

            for (int i = 0; i < n; i++) {
                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    if (arr[st.peek()] < arr[i]) {
                        st.push(i);
                    }
                }
            }
            int prev = n;
            while (!st.isEmpty()) {
                int i = st.pop();
                for (int j = i; j < prev; j++) {
                    System.out.print(arr[j] + " ");
                }
                prev = i;
            }
            System.out.println();
        }
    }
}