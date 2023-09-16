import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_118B {
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
        int n = sc.nextInt();
        func(0, n);
    }

    public static void func(int p, int n){
//        System.out.println("calling for: " + p);
        String s = "";
        for(int i = 1; i<=2*(n-p); i++){
            s+=" ";
        }
        for(int i = 0; i<p; i++){
            s+=i+" ";
        }
        s+=p + (p==0 ? "": " ");
//        System.out.println("debug: " + s);
        for(int i = p-1; i>=0; i--){
            s+=i + (i==0 ? "": " ");
        }
        System.out.println(s);
        if(p<n){
            func(p+1, n);
            System.out.println(s);
        }
    }
}
