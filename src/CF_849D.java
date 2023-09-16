import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CF_849D {
    static HashMap<Character, Integer> map1 = new HashMap<>();
    static HashMap<Character, Integer> map2 = new HashMap<>();
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
            int n = sc.nextInt();
            String s = sc.next();
            //initialize
            map1.put(s.charAt(0), 1);
            for(int i = 1; i<n; i++){
                char c = s.charAt(i);
                map2.put(c, map2.getOrDefault(c, 0) + 1);
            }
            int max = map1.size() + map2.size();
            //start dividing..
            for(int ptr = 1; ptr<n-1; ptr++){
                char c = s.charAt(ptr);
                map2.put(c, map2.getOrDefault(c, 0) - 1);
                if(map2.get(c) <= 0){
                    map2.remove(c);
                }
                map1.put(c, map1.getOrDefault(c, 0) + 1);
                max = Math.max(max, map1.size()+map2.size());
            }
            out.println(max);
            map1.clear();
            map2.clear();
        }
        out.flush();
    }
}
