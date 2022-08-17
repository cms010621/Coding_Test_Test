import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_10833 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int n = Integer.parseInt(bf.readLine());
        int tot = 0;

        for(int i=0; i<n; i++) {
            String[] str = bf.readLine().split(" ");
            int student = Integer.parseInt(str[0]);
            int apple = Integer.parseInt(str[1]);
            tot += apple%student;
        }

        bw.write(tot+"\n");
        bw.flush();  
        bw.close();  

    }
}