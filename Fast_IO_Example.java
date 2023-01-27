import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Fast_IO_Example {
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

    public static void main(String[] args){
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        double d = sc.nextDouble();
        long l = sc.nextLong();
        String word = sc.next();
        String str = sc.nextLine();
        PrintWriter out = new PrintWriter(System.out);
        out.println(n);
        out.println(d);
        out.println(l);
        out.println(word);
        out.println(str);
        out.flush();
    }
}
