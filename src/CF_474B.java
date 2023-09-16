import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_474B {
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
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += sc.nextInt();
            arr[i] = sum;
        }
        int m = sc.nextInt();
        while(m-- > 0){
            out.println(binarySearch(arr, sc.nextInt(), 0, n-1));
        }
        out.flush();
    }

    public static int binarySearch(int[] arr, int x, int lo, int hi){
        int mid = lo + (hi - lo) / 2;
        while (lo < hi){
            if(arr[mid] == x){
                return mid + 1;
            }
            else if(arr[mid] > x){
                hi = mid;
            }
            else{
                lo = mid + 1;
            }
            mid = lo + (hi - lo) / 2;
        }
        return mid + 1;
    }
}
