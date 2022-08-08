import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        
        int n = Integer.parseInt(bf.readLine());

        for(int i=1; i<=n; i++) {
            for(int j = 0; j<n-i; j++) {
                bw.write(" ");
            }
            for(int j=1; j<i*2; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        for(int i=n; i>0; i--) {
            for(int j = 0; j<n-i; j++) {
                bw.write(" ");
            }
            for(int j=1; j<i*2; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        

        bw.flush();  
        bw.close();  

    }
}