import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
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
            HashSet<Integer> set = new HashSet<>();
            int n = sc.nextInt();
            int k = sc.nextInt();
            String[] arr = new String[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.next();
            }
            for(int i = 0; i<k; i++){
                char c = arr[0].charAt(i);
                for(int j = 1; j<n; j++){
                    if(!set.contains(j)){
                        char ch = arr[j].charAt(i);
                        if(ch != c){ //disagreement in opinions..
                            set.add(j);
                        }
                    }
                }
            }
            out.println(n - set.size());
        }
        out.flush();
    }
}
