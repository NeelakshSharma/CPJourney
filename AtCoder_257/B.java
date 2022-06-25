package AtCoder_257;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String[] arr1 = s1.split(" ");
        int N = Integer.parseInt(arr1[0]);
        int K = Integer.parseInt(arr1[1]);
        int Q = Integer.parseInt(arr1[2]);
        String s2 = br.readLine();
        String[] arr2 = s2.split(" ");
        String s3 = br.readLine();
        String[] arr3 = s3.split(" ");
        int[] A = new int[K];
        for(int i = 0; i<K; i++){
            A[i] = Integer.parseInt(arr2[i]);
        }
        int[] L = new int[Q];
        for(int i = 0; i<Q; i++){
            L[i] = Integer.parseInt(arr3[i]);
        }
        func(A, L, N, K, Q);
    }

    public static void func(int[] A, int[] L, int N, int K, int Q){
        HashSet<Integer> set = new HashSet<>();
        for(int i : A){
            set.add(i);
        }
        for(int op : L){
            if(A[op-1]<N && !set.contains(A[op-1]+1)){
                set.remove(A[op-1]);
                A[op-1]++;
                set.add(A[op-1]);
            }
        }
        for(int i : A){
            System.out.print(i+" ");
        }
    }
}
