import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Tenzing_and_Books {
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
        int t = sc.nextInt(); //CHANGE IF NO TEST CASES
        while(t-- > 0){
                //START
                solve(sc, out);
        }
        out.flush();
    }

    public static void solve(FastScanner sc, PrintWriter out){
        //START
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[][] arr = new long[3][n];
        for(int i = 0; i<3; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = sc.nextLong();
            }
        }
        long ans = 0;
        boolean flag = false;
        for(int i = 0; i<3; i++){
            int ptr = 0;
            while(ptr < n && (arr[i][ptr] | x) <= x){
                ans |= arr[i][ptr];
                if(ans == x){
                    flag = true;
                    break;
                }
                ptr++;
            }
            if(flag){
                break;
            }
        }
        if(flag || x == 0){
            out.println("Yes");
        }
        else{
            out.println("No");
        }
    }
}