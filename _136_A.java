import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _136_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String s = br.readLine();
        String arr[] = s.split(" ");
        for(int x : func(arr, n)){
            System.out.print(x+" ");
        }
    }

    public static int[] func(String[] arr, String ns){
        int n = Integer.parseInt(ns);
        int[] res = new int[n];
        /*
        2 3 4 1
            res[1] = 1
            res[2] = 2
            res[3] = 3
            res[0] = 4
        */
        for(int i = 0; i<n; i++){
            res[Integer.parseInt(arr[i]) - 1] = i + 1;
        }
        return res;
    }
}
