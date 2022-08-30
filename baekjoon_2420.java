import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class baekjoon_2420 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        String[] str = bf.readLine().split(" ");
        BigInteger n = new BigInteger(str[0]);
        BigInteger m = new BigInteger(str[1]);

        BigInteger x = n.subtract(m);
        if(x.compareTo(BigInteger.ZERO) == -1) {
            bw.write(x.multiply(new BigInteger("-1"))+"");
        } else {
            bw.write(x+"");
        }

        bw.flush();
        bf.close();
    }
}
