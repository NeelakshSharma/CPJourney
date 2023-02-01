import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Borze {
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
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        String s = sc.next(), res = "";
        int ptr = 0;
        while(ptr < s.length()){
            if(s.charAt(ptr) == '.'){
                res += 0;
                ptr++;
            }
            else if(s.charAt(ptr) == '-'){
                if(s.substring(ptr, ptr+2).equals("-.")){
                    res += 1;
                }
                else if(s.substring(ptr, ptr+2).equals("--")){
                    res += 2;
                }
                ptr+=2;
            }
        }
        out.print(res);
        out.flush();
    }
}
