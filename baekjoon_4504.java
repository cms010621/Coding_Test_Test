import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_4504 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int num = Integer.parseInt(bf.readLine());
        while(true) {
            int val = Integer.parseInt(bf.readLine());
            if(val == 0) break;

            if(val%num == 0) {
                bw.write(val + " is a multiple of "+num + ".\n");
            } else {
                bw.write(val + " is NOT a multiple of "+num + ".\n");
            }   
        }

        bw.flush();
        bf.close();
    }
}