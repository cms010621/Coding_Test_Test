import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_16486 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int d1 = Integer.parseInt(bf.readLine());
        int d2 = Integer.parseInt(bf.readLine());

        double ab = (d2*2) *3.141592;
        double c = d1*2;

        bw.write((ab+c)+"\n");
        bw.flush();  
        bw.close();  

    }
}