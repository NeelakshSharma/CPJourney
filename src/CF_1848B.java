import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class CF_1848B {
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
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            scanArr(arr, n, sc);
            out.println(helper(arr, n, k));
        }
        out.flush();
    }

    public static int helper(int[] arr, int n, int k){
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        int[] last = new int[n+1];
        Arrays.fill(last, -1);
        for(int i = 0; i<n; i++){
            PriorityQueue<Integer> queue = map.getOrDefault(arr[i], new PriorityQueue<>());
            if(last[arr[i]] == -1){
                queue.add(i);
            }
            else{
                queue.add(i - last[arr[i]] - 1);
            }
            if(queue.size() > 2){
//                System.out.println("exceeding for: " + arr[i]);
                queue.poll();
            }
            last[arr[i]] = i;
//            System.out.println("queue prepared size: " + queue.size());
            map.put(arr[i], queue);
        }
//        System.out.println("before ending the bridge..");
//        for(Map.Entry<Integer, PriorityQueue<Integer>> e : map.entrySet()){
//            System.out.print(e.getKey()+": ");
//            for(int i : e.getValue()){
//                System.out.print(i+" ");
//            }
//            System.out.println("");
//        }
        for(Map.Entry<Integer, PriorityQueue<Integer>> e : map.entrySet()){
            int key = e.getKey();
            PriorityQueue<Integer> queue = e.getValue();
            queue.add(n - last[key] - 1);
            if(queue.size() > 2){
                queue.poll();
            }
//            map.put(key, queue);
        }
//        System.out.println("");
//        System.out.println("after ending the bridge..");
//        for(Map.Entry<Integer, PriorityQueue<Integer>> e : map.entrySet()){
//            System.out.print(e.getKey()+": ");
//            for(int i : e.getValue()){
//                System.out.print(i+" ");
//            }
//            System.out.println("");
//        }
        int min = n;
        for(Map.Entry<Integer, PriorityQueue<Integer>> e : map.entrySet()){
            int color = e.getKey();
            PriorityQueue<Integer> queue = e.getValue();
            int max2 = queue.poll();
            int max1 = queue.poll();
            int normMax1 = max1/2;
            if(normMax1 >= max2){
                min = Math.min(normMax1, min);
            }
            else{
                min = Math.min(min, max2);
            }
        }
        return min;
    }
}
