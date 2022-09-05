import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.io.IOException; 

public class baekjoon_9711 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        
        long n = Long.parseLong(bf.readLine());
        for(int i=0; i<n; i++) {
            String[] str = bf.readLine().split(" ");
            int p = Integer.parseInt(str[0]);
            int q = Integer.parseInt(str[1]);
            BigInteger f2 = BigInteger.ZERO;
            BigInteger f1 = BigInteger.ONE;
            BigInteger f = BigInteger.ONE;
            for(double j=3; j<=p; j++) {
                f2 = f1;
                f1 = f;
                f = f2.add(f1);
            }
            bw.write("Case #" + (i+1) + ": " + f.remainder(new BigInteger(str[1]))+"\n");
        }

        bw.flush();  
        bw.close();  

    }
}