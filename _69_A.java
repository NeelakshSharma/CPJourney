import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _69_A {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[][] arr = new int[n][3];
//        for(int i = 0; i<n; i++){
//            String s = br.readLine();
//            String[] arr1 = s.split(" ");
//            for(int j = 0; j<3; j++){
//                arr[i][j] = Integer.parseInt(arr1[j]);
//            }
//        }
//        System.out.println(func(arr, n));
//    }
//
//    public static String func(int[][] arr, int n){
//        long sum = 0;
//        for(int i = 0; i<n; i++){
//            for(int j = 0; j<3; j++){
//                sum += arr[i][j];
//            }
//        }
//        return sum==0 ? "YES": "NO";
//    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sumX = 0, sumY = 0, sumZ = 0;
        while(n-- > 0){
            sumX += sc.nextInt();
            sumY += sc.nextInt();
            sumZ += sc.nextInt();
        }
        System.out.println(sumX==0 && sumY==0 && sumZ==0 ? "YES" : "NO");
    }
}
