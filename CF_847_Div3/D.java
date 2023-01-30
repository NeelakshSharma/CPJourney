import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class CF_1790_D {
    static class FastScanner{
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next(){
            while(st == null || !st.hasMoreElements()){
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public String nextLine(){
            try{
                if(st.hasMoreTokens()){
                    return st.nextToken("\n");
                }
                else{
                    return br.readLine();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
            return "";
        }

        public int nextInt(){
            return Integer.parseInt(next());
        }

        public double nextDouble(){
            return Double.parseDouble(next());
        }

        public long nextLong(){
            return Long.parseLong(next());
        }
    }
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), max = 0, min = (int)1e9 + 1;
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i<n; i++) {
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
                max = Math.max(max, x);
                min = Math.min(min, x);
            }
            int count = 0;
            for(int i : map.keySet()){
                if(map.containsKey(i-1)){
                    count += Math.max(0, map.get(i) - map.get(i-1));
                }
                else{
                    count += map.get(i);
                }
            }
            out.println(count);
        }
        out.flush();
    }
}
