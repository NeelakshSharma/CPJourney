import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _208_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(func(s, s.length()));
    }

    public static String func(String str, int n) {
        //WUBAWUBBWUBCWUB
        StringBuilder res = new StringBuilder();
        int ptr = 0;
        StringBuilder word = new StringBuilder();
        while(ptr<n){
            if(ptr<n-2 && str.substring(ptr, ptr+3).equals("WUB")){
                while(ptr<n-2 && str.substring(ptr, ptr+3).equals("WUB")){
                    ptr+=3;
                }
                res.append(word).append(" ");
                word = new StringBuilder();
            }
            else{
                word.append(str.charAt(ptr));
                ptr++;
            }
        }
        res.append(word);
        return res.toString().trim();
    }
}
