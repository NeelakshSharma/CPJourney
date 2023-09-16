import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C {
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

    public static void scanArr(int[] arr, int n, FastScanner sc) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int Q = sc.nextInt();
        int[] arr = new int[n];
        scanArr(arr, n, sc);
        int[] dp = new int[n];
        int count = 1;
        dp[0] = count;
        if(n > 1){
            dp[1] = ++count;
        }
        for(int i = 2; i<n; i++){
            if(arr[i-1] >= arr[i] && arr[i-2] >= arr[i-1]){
//                System.out.println("??");
                dp[i] = count;
            }
            else{
                dp[i] = ++count;
            }
        }
//        System.out.println(Arrays.toString(dp));
        while(Q-- > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            l--;
            r--;
            if(l >0 && l<n-1 && dp[l-1] == dp[l+1]){
                out.println(dp[r] - dp[l] + 2);
            }
            else{
                out.println(dp[r] - dp[l] + 1);
            }
        }
        out.flush();

    }
}
