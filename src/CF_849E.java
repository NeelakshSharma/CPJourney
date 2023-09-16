import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_849E {
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
            int n = sc.nextInt();
            int[] arr = new int[n];
            long total = 0, max = Long.MIN_VALUE;
            int neg_count = 0, min = Integer.MAX_VALUE;
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
                total += Math.abs(arr[i]);
                if(arr[i] < 0){
                    neg_count++;
                }
                min = Math.min(min, Math.abs(arr[i]));
            }
            if(neg_count%2==0){
//                out.println("neg count is even");
                out.println(total);
            }
            else{
//                out.println("neg count is odd");
                out.println(total - (2*min));

            }
        }
        out.flush();
    }
}
