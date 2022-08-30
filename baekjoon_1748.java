import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class baekjoon_1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int n = Integer.parseInt(bf.readLine());
        BigInteger tot = BigInteger.ZERO;
        for(int i=1; i<=n; i++) {
            String s = String.valueOf(String.valueOf(i).length());
            tot = tot.add(new BigInteger(s));
        }

        bw.write(tot+"\n");
        bw.flush();
        bf.close();
    }
}