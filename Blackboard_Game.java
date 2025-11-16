import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Blackboard_Game {
     public static void main(String[] args) {
       
        FastReader reader = new FastReader();
        int t = reader.nextInt();
        StringBuilder output = new StringBuilder();
        while (t-- > 0) {
            int n = reader.nextInt();
            int j = reader.nextInt();
            int k = reader.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = reader.nextInt();
            }
         
            output.append(solve(n, j, k, a)).append("\n");
        }
       
        System.out.print(output);
    }
    private static String solve(int n, int j, int k, int[] a) {
       
        int strengthJ = a[j - 1];

        boolean hasStrongerOpponent = false;
        for (int strength : a) {
            if (strength > strengthJ) {
                hasStrongerOpponent = true;
                break;
            }
        }

        if (!hasStrongerOpponent) {
            return "YES";
        }

        if (k == 1) {
            return "NO";
        }

   
        return "YES";
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
}
}