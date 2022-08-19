import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_5717 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        while(true) {
            String[] str = bf.readLine().split(" ");
            if(str[0].equals("0") && str[1].equals("0")) {
                break;
            }
            bw.write(Integer.parseInt(str[0]) + Integer.parseInt(str[1])+"\n");
        }

        bw.flush();  
        bw.close();  

    }
}