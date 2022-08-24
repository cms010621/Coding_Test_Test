import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_13752 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int num = Integer.parseInt(bf.readLine());
        for(int i=0; i<num; i++) {
            int s = Integer.parseInt(bf.readLine());
            for(int j=0; j<s; j++) {
                bw.write("=");
            }
            bw.write("\n");
        }

        bw.flush();  
        bw.close();  

    }
}