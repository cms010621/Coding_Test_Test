import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;

public class baekjoon_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int m = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        BigInteger total = BigInteger.ZERO;

        for(int i=m; i<=n; i++) {
            int num = i;
            int check = 0;
            for(int j=2; j<=Math.sqrt(num); j++) {
                if(num%j == 0) {
                    check = 1;
                }
            }
            if(check == 0 && i != 1) {
                arr.add(i);
                total = total.add(new BigInteger(i+""));
            }
        }
        if(total.equals(BigInteger.ZERO)) {
            bw.write("-1");
        } else {
            bw.write(total+"\n");
            bw.write(arr.get(0)+"\n");
        }

        bw.flush();
        bf.close();
    }
}
