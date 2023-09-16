import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class CF_1472D {
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
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            PriorityQueue<Integer> queue = new PriorityQueue<>(n,(a, b) -> b-a);
            for(int i = 0; i<n; i++){
                queue.add(sc.nextInt());
            }
            long total1 = 0, total2 = 0, flag = 0;
            while(!queue.isEmpty()){
                int front = queue.poll();
                if(flag == 0 && front%2 == 0){
                    total1 += front;
                }
                else if(flag == 1 && front%2!=0){
                    total2 += front;
                }
                flag ^=1;
            }
            out.println(total1 > total2 ? "Alice" : ((total1 == total2) ? "Tie" : "Bob"));
        }
        out.flush();
    }
}