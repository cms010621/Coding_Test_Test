import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_10996 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int n = Integer.parseInt(bf.readLine());

        for(int i=0; i<n*2; i++) {
            for(int j=0; j<n; j++) {
                if(i % 2 == 0) {
                    if(j%2 == 0) {
                        bw.write("*");
                    } else {
                        bw.write(" ");
                    }
                } else {
                    if(j%2 == 0) {
                        bw.write(" ");
                    } else {
                        bw.write("*");
                    }
                }
            }
            bw.write("\n");
        }

        bw.flush();  
        bw.close();  

    }
}