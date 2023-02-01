import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF_80A {
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
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] arr = new boolean[51];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        for(int i = 2; i<=50; i++){
            if(arr[i] && i*i < 50){
                for(int j = i*i; j<=50; j+=i){
                    arr[j] = false;
                }
            }
        }
        boolean flag = true;
        for(int i = n+1; i<m; i++){
            if(arr[i]){
//                System.out.println(i);
                flag = false;
            }
        }
//        System.out.println(flag);
//        System.out.println(arr[m]);
        if(!arr[m] || !flag){
            out.println("NO");
        }
        else{
            out.println("YES");
        }
        out.flush();
    }
}
