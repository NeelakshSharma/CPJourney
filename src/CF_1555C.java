import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_1555C {
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
        int t = sc.nextInt();
        while(t-- > 0){
            int m = sc.nextInt();
            int[][] arr = new int[2][m];
            for(int i = 0; i<2; i++){
                for(int j = 0; j<m; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int[] pref = new int[m];
            int[] suff = new int[m];
            int total = 0;
            for(int i = m-1; i>=0; i--){
                suff[i] = total;
                total += arr[0][i];
            }
            total = 0;
            for(int i = 0; i<m; i++){
                pref[i] = total;
                total += arr[1][i];
            }
            int ans = Integer.MAX_VALUE;
            for(int i = 0; i<m; i++){
//                out.println(suff[i] + ", " +  pref[i]);
                ans = Math.min(Math.max(pref[i], suff[i]), ans);
            }
            out.println(ans);
        }
        out.flush();
    }
}
