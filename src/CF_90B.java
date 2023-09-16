import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_90B {
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public String nextLine() {
            try {
                if (st.hasMoreTokens()) {
                    return st.nextToken("\n");
                } else {
                    return br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "";
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void scanIntArr(int[] arr, int n, FastScanner sc) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for(int i = 0; i<n; i++){
            String temp = sc.next();
            for(int j = 0; j<m; j++){
                arr[i][j] = temp.charAt(j);
            }
        }
        ////System.out.println("scanned mat:");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
//                //System.out.print(arr[i][j]+", ");
//                s += arr[i][j] == '0' ? "" : arr[i][j];
            }
            ////System.out.println("");
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(arr[i][j] != '0'){
                    ////System.out.println("called for: " + arr[i][j]);
                    checkDup(arr, i, j, n, m, arr[i][j]);
                }
            }
        }
        String s = "";
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
//                //System.out.print(arr[i][j]+", ");
                s += arr[i][j] == '0' ? "" : arr[i][j];
            }
            ////System.out.println("");
        }
        out.println(s);
        out.flush();
    }

    public static void checkDup(char[][] arr, int row, int col, int n, int m, char c){
        ////System.out.println("checking for..: " + row+","+col+": "+arr[row][col]);
        if(c == '0'){
            return;
        }
//        char c = arr[row][col];
        for(int i = 0; i<n; i++){
            if(row!= i && arr[i][col] ==  c){
                arr[row][col] = '0';
                arr[i][col] = '0';
                checkDup(arr, i, col, n, m, c);
            }
        }
        for(int i = 0; i<m; i++){
            if(col!= i && arr[row][i] ==  c){
                arr[row][col] = '0';
                arr[row][i] = '0';
                checkDup(arr, row, i, n, m, c);
            }
        }
    }
}
