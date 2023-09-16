import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B {
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

    public static void scanArr(long[] arr, int n, FastScanner sc) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            scanArr(arr, n, sc);
            long l1 = Math.min(arr[0], arr[1]);
            long l2 = Math.max(arr[0], arr[1]);
            long m1 = Math.min(arr[0], arr[1]);
            long m2 = Math.max(arr[0], arr[1]);
            for(int i = 2; i<n; i++){
                if(arr[i] < l1){
                    l2 = l1;
                    l1 = arr[i];
                }
                else if(arr[i] < l2){
                    l2 = arr[i];
                }
                if(arr[i] > m2){
                    m1 = m2;
                    m2 = arr[i];
                }
                else if(arr[i] > m1){
                    m1 = arr[i];
                }
            }
            out.println(Math.max((m1*m2),(l1*l2)));
        }
        out.flush();
    }
}
