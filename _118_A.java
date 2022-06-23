import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class _118_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(func(s));
    }

    public static String func(String s){
        StringBuilder s1 = new StringBuilder();
        for(char c : s.toCharArray()){
            if(!(Character.toLowerCase(c)=='a' || Character.toLowerCase(c)=='e' || Character.toLowerCase(c)=='i' || Character.toLowerCase(c)=='o' || Character.toLowerCase(c)=='u' || Character.toLowerCase(c)=='y')){
                s1.append(".").append(Character.toLowerCase(c));
            }
        }
        return s1.toString();
    }
}
