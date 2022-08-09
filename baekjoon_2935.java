import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class baekjoon_2935 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        BigInteger a = new BigInteger(bf.readLine());
        String opt = bf.readLine();
        BigInteger b = new BigInteger(bf.readLine());

        if(opt.equals("*")) {
            bw.write(a.multiply(b)+"");
        } else {
            bw.write(a.add(b)+"");
        }
        bw.flush();
        bf.close();
    }
}