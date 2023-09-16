import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_445A {
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
        CF_1788_B.FastScanner sc = new CF_1788_B.FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for(int i = 0; i<n; i++) {
            String s = sc.next();
            for(int j = 0; j<m; j++){
                arr[i][j] = s.charAt(j);
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                char ch = arr[i][j];
                if(ch == '.'){
                    if((j-1 >=0 && arr[i][j-1] == 'W') || (j+1 < m && arr[i][j+1] == 'W') || (i-1 >=0 && arr[i-1][j] == 'W') || (i+1 < n && arr[i+1][j] == 'W')){
                        arr[i][j] = 'B';
                        if(j-1 >= 0 && arr[i][j-1] == '.'){
                            arr[i][j-1] = 'W';
                        }
                        if(j+1 < m && arr[i][j+1] == '.'){
                            arr[i][j+1] = 'W';
                        }
                        if(i-1 >= 0 && arr[i-1][j] == '.'){
                            arr[i-1][j] = 'W';
                        }
                        if(i+1 < n && arr[i+1][j] == '.'){
                            arr[i+1][j] = 'W';
                        }
                    }
                    else{
                        arr[i][j] = 'W';
                        if(j-1 >= 0 && arr[i][j-1] == '.'){
                            arr[i][j-1] = 'B';
                        }
                        if(j+1 < m && arr[i][j+1] == '.'){
                            arr[i][j+1] = 'B';
                        }
                        if(i-1 >= 0 && arr[i-1][j] == '.'){
                            arr[i-1][j] = 'B';
                        }
                        if(i+1 < n && arr[i+1][j] == '.'){
                            arr[i+1][j] = 'B';
                        }
                    }
                }
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                out.print(arr[i][j]);
            }
            out.println("");
        }
        out.flush();
    }
}
