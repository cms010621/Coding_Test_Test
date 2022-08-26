import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.io.IOException; 

public class baekjoon_1493{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        BigInteger x = new BigInteger(bf.readLine());
        int cnt = 0;
        while(true) {
            if(x.remainder(BigInteger.valueOf(3)) == BigInteger.ZERO) {
                x = x.divide(BigInteger.valueOf(3));
                bw.write("3 x : "+x+"\n");
                cnt++;
            } else {
                if(x.remainder(BigInteger.valueOf(2)) == BigInteger.ZERO) {
                    x = x.divide(BigInteger.valueOf(2));
                    bw.write("2 x : "+x+"\n");
                    cnt++;
                } else {
                    x = x.subtract(BigInteger.ONE);
                    bw.write("1 x : "+x+"\n");
                    cnt++;
                }
            }
            if(x.compareTo(BigInteger.ONE) == 0) break;
        }
        bw.write(cnt+"\n");
        bw.flush();  
        bw.close();  

    }
}