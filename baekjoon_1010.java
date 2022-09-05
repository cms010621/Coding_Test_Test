import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        int n = Integer.parseInt(bf.readLine());
        int num = 67863915;
        int tot = 1;
        for(int i=2; i<=num; i++) {
            
            if(num%i == 0) {
                bw.write("i : "+i+"\n");
                num = num/i;
                tot *= i;
                bw.write("tot : "+tot+"\n");
            }
        }

        bw.write(tot+"\n");
        bw.flush();  
        bw.close();  

    }
}