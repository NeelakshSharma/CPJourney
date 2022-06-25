import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _144_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        s = br.readLine();
        String[] arr = s.split(" ");
        System.out.println(func(arr, n));
    }

    public static int func(String[] arr, int n){
        int count = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, minIndex = -1, maxIndex = -1;
        for(int i = 0; i<n; i++){
            int x = Integer.parseInt(arr[i]);
            if(x<=min){
                min = x;
                minIndex = i;
            }
            if(x>max){
                max = x;
                maxIndex = i;
            }
        }
        count += maxIndex + n - 1 - minIndex - (minIndex<maxIndex ? 1 : 0);
        return count;
    }
}
