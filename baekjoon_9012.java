import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int t = Integer.parseInt(bf.readLine());

        for(int i=0; i<t; i++) {
            String s = bf.readLine();
            while(true) {
                if(s.contains("()")) {
                    s = s.replaceFirst("\\(\\)", "");
                } else {
                    break;
                }
            }
            bw.write(s.equals("") ? "YES\n" : "NO\n");
        }
        bw.flush();
        bf.close();
    }
}