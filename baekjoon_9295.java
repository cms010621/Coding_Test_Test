import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_9295 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int cnt = Integer.parseInt(bf.readLine());
        for(int i=1; i<=cnt; i++) {
            String[] str = bf.readLine().split(" ");
            bw.write("Case " + i + ": " + (Integer.parseInt(str[0]) + Integer.parseInt(str[1]))+"\n");
        }

        bw.flush();
        bf.close();
    }
}