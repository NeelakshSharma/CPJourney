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

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            scanArr(arr, n, sc);
            int i1 = 0, i2 = 0, iMax = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] == 1){
                    i1 = i+1;
                }
                else if(arr[i] == 2){
                    i2 = i+1;
                }
                else{
                    if(arr[i] > arr[iMax]){
                        iMax = i;
                    }
                }
            }
            iMax++;
            if(i1 < iMax && i2 < iMax){
                out.println((i1 < i2 ? i2 : i1)+" " +iMax);
            }
            else if(i1 > iMax && i2 > iMax){
                out.println((i1 < i2 ? i1 : i2)+" " +iMax);
            }
            else{
                out.println(iMax+" "+iMax);
            }
        }
        out.flush();
    }
}
