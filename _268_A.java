import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class _268_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] home = new int[n];
        int[] guest = new int[n];
        for(int i = 0; i<n; i++){
            String str = br.readLine();
            String[] arr = str.split(" ");
            home[i] = Integer.parseInt(arr[0]);
            guest[i] = Integer.parseInt(arr[1]);
        }
        System.out.println(func(home, guest, n));
    }

    public static int func(int[] home, int[] guest, int n){
        HashMap<Integer, Integer> homeCount = new HashMap<>();
        HashMap<Integer, Integer> guestCount = new HashMap<>();
        int count = 0;
        for(int i = 0; i<n; i++){
            int homeD = home[i];
            int guestD = guest[i];
            count += homeCount.getOrDefault(guestD, 0);
            count += guestCount.getOrDefault(homeD, 0);
            homeCount.put(homeD, homeCount.getOrDefault(homeD, 0) + 1);
            guestCount.put(guestD, guestCount.getOrDefault(guestD, 0) + 1);
        }
        return count;
    }
}
