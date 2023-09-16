import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

//https://codeforces.com/contest/1790/problem/C
public class CF_1790_C{
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
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            for(int i = 0; i<=n; i++){
                list.add(new ArrayList<>());
            }
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n-1; j++){
                    int x = sc.nextInt();
                    list.get(x).add(j);
                }
            }
            int[] arr = new int[n];
            for(int i = 1; i<=n; i++){
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for(int j : list.get(i)){
                    max = Math.max(j, max);
                    min = Math.min(j, min);
                }
//                System.out.println("for " + i + " max: " + max + " min: " + min);
                if(max == n-2 && max==min){
                    arr[n-1] = i;
                }
                else{
                    arr[max] = i;
                }
            }
            for(int i : arr){
                out.print(i+" ");
            }
            out.println("");
        }
        out.flush();
    }
}