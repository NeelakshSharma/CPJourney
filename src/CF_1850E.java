import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_1850E {
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
            long C = sc.nextLong();
            int[] arr = new int[n];
            scanArr(arr, n, sc);
            long lo = 1, hi = (int)1e+9;
            while(lo <= hi){
                long mid = lo + (hi - lo)/2;
                long area = 0;
                for(int i = 0; i<n; i++){
                    area += (arr[i] + (2 * mid)) * (arr[i] + (2 * mid));
                    if(area > C){
                        break;
                    }
                }
                if(area == C){
                   out.println(mid);
                   break;
                }
                else if(area > C){
                    hi = mid - 1;
                }
                else{
                    lo = mid + 1;
                }
            }
        }
        out.flush();
    }
}
