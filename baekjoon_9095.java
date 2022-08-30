import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.io.IOException; 

public class baekjoon_9095{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int t = Integer.parseInt(bf.readLine());
        for(int i=0; i<t; i++) {
            int n = Integer.parseInt(bf.readLine());
            int oneCnt = n/1;
            int twoCnt = n/2;
            int threeCnt = n/3;

        }
        bw.write(cnt+"\n");
        bw.flush();  
        bw.close();  

    }
}