import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B_Maximum_Sum {
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public String nextLine() {
            try {
                if (st.hasMoreTokens()) {
                    return st.nextToken("\n");
                } else {
                    return br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "";
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }


    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt(); //CHANGE IF NO TEST CASES
        while(t-- > 0){
                //START
                solve(sc, out);
        }
        out.flush();
    }

    public static void solve(FastScanner sc, PrintWriter out){
        //START
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long[] pre = new long[n+1];
        long preSum = 0;
        for(int i = 1; i<=n; i++){
            preSum += arr[i-1];
            pre[i] = preSum;
        }
        long ans = 0;
        for(int i = 0; i<=k; i++){
            ans = Math.max(ans, pre[n - i] - pre[2*(k - i)]);
        }
        out.println(ans);
    }
}