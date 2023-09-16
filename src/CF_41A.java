import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_41A {
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
        String s1 = sc.next();
        String s2 = sc.next();
        boolean flag = true;
        if(s1.length()!=s2.length()){
            out.print("NO");
            out.flush();
            return;
        }
        else{
            for(int i = 0; i<s1.length(); i++){
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(s1.length() - 1 - i);
                if(c1!=c2){
                    flag = false;
                    break;
                }
            }
        }
        out.print(flag ? "YES" : "NO");
        out.flush();
    }
}
