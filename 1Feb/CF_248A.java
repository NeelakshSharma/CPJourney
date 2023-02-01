import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_248A {
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
        int n = sc.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];
        for(int i = 0; i<n; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        int left_min = Integer.MAX_VALUE, right_min = Integer.MAX_VALUE;
        int ones = 0, zeros = 0;
        for(int i = 0; i<n; i++){
            if(l[i] == 0){
                zeros++;
            }
            else{
                ones++;
            }
        }
        left_min = Math.min(zeros, ones);
        zeros = 0;
        ones = 0;
        for(int i = 0; i<n; i++){
            if(r[i] == 0){
                zeros++;
            }
            else{
                ones++;
            }
        }
        right_min = Math.min(zeros, ones);
        out.println(left_min+ right_min);
        out.flush();
    }
}
