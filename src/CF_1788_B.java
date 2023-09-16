import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CF_1788_B {
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
            if(n%2 == 0){
                out.println((n/2)+" "+(n/2));
            }
            else{
                int f = n/2;
                if((f+1)%10==0){
                    int s = (n/2)+1;
                    while(f >= 0 && s >= 0 && sumDig(f)!=sumDig(s) && Math.abs(sumDig(f) - sumDig(s)) != 1){
//                        System.out.println(sumDig(f)+" "+sumDig(s));
                        f--;
                        s++;
                    }
                    out.println(f+" "+s);
                }
                else{
                    out.println((f)+" "+(f+1));
                }
            }
        }
        out.flush();
    }

    public static int sumDig(int n){
        int sum = 0;

        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }

        return sum;
    }
}
