import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class baekjoon_10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        
        String arr[] = bf.readLine().split(" ");

        String ab = arr[0] + arr[1];
        String cd = arr[2] + arr[3];
        BigInteger tot = new BigInteger(ab).add(new BigInteger(cd));

        bw.write(tot + "\n");
        bw.flush();
        bf.close();
    }
}
