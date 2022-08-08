import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.io.IOException; 

public class baekjoon_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        ArrayList<String> arr = new ArrayList<>();

        int cnt = Integer.parseInt(bf.readLine());
        int tot = 0;

        for(int i=0; i<cnt; i++) {
            String[] str = bf.readLine().split("");
            

        }

        bw.write(cnt + "");
        bw.flush();
        bf.close();
    }
}