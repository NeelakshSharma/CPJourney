import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {
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
        int t = sc.nextInt();
        while(t-- > 0) {
            boolean flag = false;
            int n = sc.nextInt();
            int x = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0; i<10; i++){
                if ((n & (1 <<i)) != 0){
                    set.add(i);
                }
            }
            Stack<Integer>[] arr = new Stack[3];
            Arrays.fill(arr, new Stack<Integer>());
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i].push(sc.nextInt());
                }
            }
            int res = 0;
            while(!arr[0].isEmpty()){
                int peek = arr[0].pop();
                if(peek <= x){
                    res|=peek;
                    if(res == x){
                        System.out.println("YES");
                        flag = true;
                        break;
                    }
                }
            }
            if(flag){
                continue;
            }
            while(!arr[1].isEmpty()){
                int peek = arr[0].pop();
                if(peek <= x){
                    res|=peek;
                    if(res == x){
                        System.out.println("YES");
                        flag = true;
                        break;
                    }
                }
            }
            if(flag){
                continue;
            }
            while(!arr[2].isEmpty()){
                int peek = arr[2].pop();
                if(peek <= x){
                    res|=peek;
                    if(res == x){
                        System.out.println("YES");
                        flag = true;
                        break;
                    }
                }
            }
            if(!flag){
                System.out.println("NO");
            }
        }
    }
}
