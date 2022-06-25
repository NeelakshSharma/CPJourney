package AtCoder_257;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split(" ");
        System.out.println(func(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])));
    }

    public static char func(int N, int X){
        return (char)(64+(int)Math.ceil((double)X/N));
    }
}
