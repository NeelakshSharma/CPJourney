import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_849C {
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
        while(t -- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int l = 0, r = s.length() - 1;
            boolean flag = false;
            while(l<r){
                char lc = s.charAt(l), rc = s.charAt(r);
                if(lc == '0' && rc == '1'){
                    l++;
                    r--;
                }
                else if(lc == '1' && rc == '0'){
                    l++;
                    r--;
                }
                else{
                    flag = true;
                    break;
                }
            }
            if(flag){
                out.println(r - l + 1);
            }
            else{
                out.println(s.length()%2==0 ? 0 : 1);
            }
        }
        out.flush();
    }
}
