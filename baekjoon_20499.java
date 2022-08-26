import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_20499 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        String[] str = bf.readLine().split("/");
        int k = Integer.parseInt(str[0]);
        int d = Integer.parseInt(str[1]);
        int a = Integer.parseInt(str[2]);
        if(k+a < d || d == 0) {
            bw.write("hasu");
        } else {
            bw.write("gosu");
        }

        bw.flush();  
        bw.close();  

    }
}