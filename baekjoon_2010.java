import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_2010 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int n = Integer.parseInt(bf.readLine());
        int tot = 0;
        for(int i=0; i<n-1; i++) {
            tot += Integer.parseInt(bf.readLine())-1;
        }
       
        tot += Integer.parseInt(bf.readLine());
        bw.write(tot+" ");
        bw.flush();  
        bw.close();  

    }
}