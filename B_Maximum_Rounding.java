import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_Maximum_Rounding {
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


    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt(); //CHANGE IF NO TEST CASES
        while(t-- > 0){
                //START
                solve(t, sc, out);
        }
        out.flush();
    }

    public static void solve(int t, FastScanner sc, PrintWriter out){
        //START
        String s = sc.next();
        int[] arr = new int[s.length() + 1];
        arr[0] = 0;
        for(int i = 1; i<s.length() + 1; i++){
            arr[i] = Character.getNumericValue(s.charAt(i-1));
        }
        boolean flag = false; int ptr = arr.length - 1;
        // System.out.println(Arrays.toString(arr));
        for(int i = arr.length - 1; i>=1; i--){
            int val = arr[i];
            if(val >=5){
                flag = true;
                arr[i-1]++;
                ptr = i;
            }
        }
        if(flag){
            int ptr1 = 0;
            while(ptr1 < arr.length && arr[ptr1] == 0){
                ptr1++;
            }
            for(int i = ptr1; i<ptr; i++){
                out.print(arr[i]);
            }
            for(int i = ptr; i<arr.length; i++){
                out.print(0);
            }
        }
        else{
            out.print(s);
        }
        out.println("");
    }
}