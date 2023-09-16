import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_1869B {
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
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] x = new int[n + 1];
            int[] y = new int[n + 1];
            for(int i = 1; i<=n; i++){
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
            }
            long dist = (long)Math.abs(x[a] - x[b]) + (long)Math.abs(y[a] - y[b]);
            if(k == 0){
                out.println(dist);
                continue;
            }
            long distA = Long.MAX_VALUE;
            if(a <= k){
                distA = 0;
            }
            else{
                for(int i = 1; i<=k; i++){
                    distA = Math.min(distA, (long)Math.abs(x[a] - x[i]) + (long)Math.abs(y[a] - y[i]));
                }
            }

            long distB = Long.MAX_VALUE;
            if(b <= k){
                distB = 0;
            }
            else{
                for(int i = 1; i<=k; i++){
                    distB = Math.min(distB, (long)Math.abs(x[b] - x[i]) + (long)Math.abs(y[b] - y[i]));
                }
            }
            long totalDist = distA + distB;
            out.println(Math.min(totalDist, dist));
        }
        out.flush();
    }
}
