import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.io.IOException; 
import java.util.*;

public class baekjoon_10826 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        
        int n = Integer.parseInt(bf.readLine());
        ArrayList<BigInteger> arr = new ArrayList<>();
        arr.add(BigInteger.ZERO);
        arr.add(BigInteger.ONE);
        for(int i=2; i<=n; i++) {
            arr.add(arr.get(i-2).add(arr.get(i-1)));
        }

        bw.write(arr.get(n)+"\n");

        bw.flush();  
        bw.close();  

    }
}