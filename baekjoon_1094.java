import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int x = Integer.parseInt(bf.readLine());
        String bin = Integer.toBinaryString(x);
        String str = bin.replaceAll("1", "");
        int cnt = bin.length() - str.length();

        bw.write(cnt+" ");
        bw.flush();  
        bw.close();  

    }
}