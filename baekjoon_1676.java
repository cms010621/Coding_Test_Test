import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class baekjoon_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int n = Integer.parseInt(bf.readLine());
        BigInteger d = BigInteger.ONE;
        for(int i=1; i<=n; i++) {
            d = d.multiply(BigInteger.valueOf(i));
        }
        StringBuffer sb = new StringBuffer(String.valueOf(d));
        sb.reverse();
        String s = String.valueOf(sb);
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != '0') {
                bw.write((i)+"\n");
                break;
            }
        }
        bw.flush();
        bf.close();
    }
}