import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_59A {
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
        String s = sc.next();
        int u = 0, l = 0;
        for(int i = 0; i<s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
                l++;
            }
            else{
                u++;
            }
        }
        if(u <= l){
            for(int i = 0; i<s.length(); i++){
                out.print(Character.toLowerCase(s.charAt(i)));
            }
        }
        else{
            for(int i = 0; i<s.length(); i++){
                out.print(Character.toUpperCase(s.charAt(i)));
            }
        }
        out.flush();
    }
}
