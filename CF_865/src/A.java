import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class A {
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
            int p = sc.nextInt();
            int q = sc.nextInt();
            out.println(p+" "+q);
            if(gcd(p,q) == 1){
                out.println(1);
                out.println(p+" "+q);
            }
            else{
                long x = p, y = q;
                long gcd1 = gcd(p, q-y);
                long gcd2 = gcd(q, p-x);
                while (gcd1 > 1 || gcd2 > 1) {
                    if (gcd1 > gcd2) {
                        x += gcd1;
                        gcd1 = gcd(x, q-y);
                    } else {
                        y += gcd2;
                        gcd2 = gcd(y, p-x);
                    }
                }
                out.println(2);
                out.println(x+" "+y);
                out.println(p+" "+q);
            }
        }
        out.flush();
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
