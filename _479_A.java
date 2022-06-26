import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _479_A {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Math.max(a+b+c, Math.max(a*(b+c),Math.max((a+b)*c,a*b*c))));
    }
}
