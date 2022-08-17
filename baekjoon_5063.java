import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_5063 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int n = Integer.parseInt(bf.readLine());

        for(int i=0; i<n; i++) {
            String[] str = bf.readLine().split(" ");
            int r = Integer.parseInt(str[0]);
            int e = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);
            if(e - c > r) {
                bw.write("advertise\n");
            } else if(e - c == r) {
                bw.write("does not matter\n");
            } else {
                bw.write("do not advertise\n");
            }
        }

        bw.flush();  
        bw.close();  

    }
}