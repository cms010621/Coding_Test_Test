import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_2523 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int cnt = Integer.parseInt(bf.readLine());

        for(int i=1; i<=cnt; i++) {
            String s = "";
            int num = (cnt*2)-(i*2);
            for(int j=1; j<=cnt*2; j++) {
                if(j <= i) {
                    s += "*";
                } else {
                    s += " ";
                }
            }
            bw.write(s+"\n");
        }
        for(int i=cnt-1; i>0; i--) {
            String s = "";
            int num = (cnt*2)-(i*2);
            for(int j=1; j<=cnt*2; j++) {
                if(j <= i) {
                    s += "*";
                } else {
                    s += " ";
                }
            }
            bw.write(s+"\n");
        }

        bw.flush();
        bf.close();
    }
}
