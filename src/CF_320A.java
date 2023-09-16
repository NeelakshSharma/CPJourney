import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_320A {
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
        String s = sc.next();
        int ptr = 0;
        while(ptr < s.length()){
            if(ptr <= s.length() - 3 && s.substring(ptr, ptr+3).equals("144")){
                ptr += 3;
            }
            else if(ptr<= s.length() - 2 && s.substring(ptr, ptr+2).equals("14")){
                ptr += 2;
            }
            else if(ptr<= s.length() - 1 && s.substring(ptr, ptr+1).equals("1")){
                ptr += 1;
            }
            else{
                out.print("NO");
                out.flush();
                return;
            }
        }
        out.print("YES");
        out.flush();
    }
}
