import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_10990 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int num = Integer.parseInt(bf.readLine());
        int blank = 0;
        String str = "";
        for(int i=1; i<=num; i++) {
            for(int j=num-i; j>0; j--) {
                str += " ";
            }
            str += "*";
            if(i > 2) {
                blank += 2;
            } else if(i ==1) {
                blank ++;
            }
            for(int j=0; j<blank; j++) {
                str += " ";
            }
            if(i > 1) {
                str += "*";
            }
            bw.write(str + "\n");
            str = "";

        }
       
        bw.flush();
        bf.close();
    }
}