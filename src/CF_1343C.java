import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_1343C {
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
            int[] arr = new int[n];
            scanArr(arr, n, sc);
            out.println(helper(arr, n));
        }
        out.flush();
    }

    public static long helper(int[] arr, int n){
        long total = 0;
        int ptr = 0,  max = 0;
        while(ptr < n){
            if(arr[ptr] < 0){
                max = arr[ptr];
                while(ptr < n && arr[ptr] < 0){
                    max = Math.max(max, arr[ptr]);
                    ptr++;
                }
                total += max;
            }
            else{
                if(arr[ptr] > 0){
                    max = arr[ptr];
                    while(ptr < n && arr[ptr] > 0){
                        max = Math.max(max, arr[ptr]);
                        ptr++;
                    }
                    total += max;
                }
            }
        }
        return total;
    }
}
