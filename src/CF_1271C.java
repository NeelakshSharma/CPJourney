import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_1271C {
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

    public static void scanArr(int[] arr, int n, FastScanner sc) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int xMax = sx, yMax = sy;
        int[] count = new int[4];
        int dir[] = {sy + 1, sy - 1, sx - 1, sx + 1};
        /*
        * arr[0] = top
        * arr[1] = down
        * arr[2] = left
        * arr[3] = right
        * */
        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = 0; j<2; j++){
                if(dir[j] <= Math.max(y, sy) && dir[j] >= Math.min(y, sy)){
                    count[j]++;
                }
            }
            for(int j = 2; j<4; j++){
                if(dir[j] <= Math.max(x, sx) && dir[j] >= Math.min(x, sx)){
                    count[j]++;
                }
            }
        }
        int max = 0, resX = 0, resY = 0;
        for(int i = 0; i<4; i++){
            if(max < count[i]){
                max = count[i];
                if(i == 0){
                    resX = sx;
                    resY = sy + 1;
                }
                else if(i == 1){
                    resX = sx;
                    resY = sy - 1;
                }
                else if(i==2){
                    resX = sx - 1;
                    resY = sy;
                }
                else{
                    resX = sx + 1;
                    resY = sy;
                }
            }
        }
        out.println(max);
        out.println(resX+" "+resY);
        out.flush();
    }
}
