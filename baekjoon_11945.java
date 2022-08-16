import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_11945 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        String st[] = bf.readLine().split(" ");
        int n = Integer.parseInt(st[0]);

        for(int i=0; i<n; i++) {
            StringBuffer sb = new StringBuffer(bf.readLine());
            String revStr = sb.reverse().toString();
            bw.write(revStr+"\n");
        }

        bw.flush();
        bf.close();
    }
}