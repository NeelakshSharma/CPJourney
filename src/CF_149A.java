import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class CF_149A {
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
        int k = sc.nextInt();
        Integer[] arr = new Integer[12];
        for(int i = 0; i<12; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return b.intValue() - a.intValue();
            }
        });
//        System.out.println(Arrays.toString(arr));
        int ptr = 0, count = 0;
        while(ptr < 12 && k > 0){
            count++;
            k -= arr[ptr];
            ptr++;
        }
        if(k > 0){
            out.print(-1);
        }
        else{
            out.print(count);
        }
        out.flush();
    }
}
