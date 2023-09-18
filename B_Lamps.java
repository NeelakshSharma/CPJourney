import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B_Lamps {
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
        int t = sc.nextInt(); // CHANGE IF NO TEST CASES
        while (t-- > 0) {
            // START
            solve(sc, out);
        }
        out.flush();
    }

    public static void solve(FastScanner sc, PrintWriter out) {
        // START
        int n = sc.nextInt();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            ArrayList<Integer> list;
            if (map.get(a) != null) {
                list = map.get(a);
            }
            else{
                list = new ArrayList<>();
            }
            list.add(b);
            map.put(a, list);
        }
        long res = 0;
        for (int i : map.keySet()) {
            // if (map.get(i) != null) {
            ArrayList<Integer> list = map.get(i);
            Collections.sort(list, Collections.reverseOrder());
            // out.println(i);
            for(int j = 0; j<Math.min(i, list.size()); j++){
                // out.print(list.get(j)+", ");
                res += list.get(j);
            }
            // out.println("");
            // }
        }
        out.println(res);
        // out.println("----------------------------------");
    }
}