import java.util.Scanner;

public class CF_270A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            System.out.println((360%(180-n)) == 0 ? "YES":"NO");
        }
    }
}
