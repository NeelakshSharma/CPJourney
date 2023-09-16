import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

//https://codeforces.com/contest/1790/problem/B
public class CF_1790_B {
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
        while(t-- >0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int r = sc.nextInt();
            int max = s - r, rem = n-1;
            while(rem > 0){
                int q = r/rem;
                q = Math.min(q, max);
                out.print(q+ " ");
                r -= q;
                rem--;
            }
            out.println(max);
        }
        out.flush();
    }

    public static int ceil(int a, int b){
        if(a%b==0){
            return a/b;
        }
        return (a/b) + 1;
    }
}
