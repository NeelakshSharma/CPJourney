//https://codeforces.com/contest/1/problem/A
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_1A {
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
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        PrintWriter out = new PrintWriter(System.out);
        out.println(longCeil(n, a)*longCeil(m, a));
        out.flush();
    }

    public static long longCeil(long a, long b){
        long c = a/b;
        return a%b == 0 ? c : c+1;
    }
}
