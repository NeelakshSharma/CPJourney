import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class PascalTriangle_nCr {
    static class FastScanner{
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next(){
            try{
                while(st == null || !st.hasMoreTokens()){
                    st = new StringTokenizer(br.readLine());
                }
            }
            catch(Exception e){
                e.printStackTrace();
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
            catch(Exception e){
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

        public Long nextLong(){
            return Long.parseLong(next());
        }
    }
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int[][] arr = new int[101][101];
        initialize(arr, 100);
        out.println(arr[n][r]);
        out.flush();
    }

    public static void initialize(int[][] arr, int n){
        arr[0][0] = 1;
        for(int i = 1; i<=n; i++){
            arr[i][0] = 1;
            for(int j = 1; j<=i; j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
    }
}
