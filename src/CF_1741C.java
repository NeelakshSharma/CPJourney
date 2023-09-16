import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_1741C {
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

    public static void scanArr(int[] arr, int n, FastScanner sc){
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){int n = sc.nextInt();
            int[] arr = new int[n];
            scanArr(arr, n, sc);
            int len = 1, ans = n, total = 0;
            while(len <= n && len <= ans){
//                System.out.println("tring with length : " + len);
                total += arr[len-1];
                int ptr = len, newTotal = 0, newAns = len, temp = len - 1;
                while(ptr < n){
                    newTotal += arr[ptr];
                    if(newTotal == total){
//                        System.out.println("partitioned at: " + ptr);
                        newTotal = 0;
                        newAns = Math.max(newAns, ptr - temp);
                        temp = ptr;
                    }
                    else if(newTotal > total){
                        break;
                    }
                    ptr++;
                }
                if(ptr >= n && newTotal == 0){
//                    System.out.println("can be divided...: " + newAns);
                    ans = Math.min(ans, newAns);
                }
                len++;
            }
            out.println(ans);
        }
        out.flush();
    }
}
