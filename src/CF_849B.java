import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_849B {
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
            boolean flag = false;
            int n = sc.nextInt();
            int x = 0, y = 0;
            String s = sc.next();
            for(int i = 0; i<n; i++){
                char c = s.charAt(i);
                if(c == 'U'){
                    y++;
                }
                else if(c == 'R'){
                    x++;
                }
                else if(c == 'L'){
                    x--;
                }
                else{
                    y--;
                }
                if(x==1 && y == 1){
                    out.flush();
                    flag = true;
                    break;
                }
            }
            if(flag){
                out.println("YES");
            }
            else{
                out.println("NO");
            }
            out.flush();
        }
    }
}
