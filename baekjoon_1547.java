import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_1547 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int num = Integer.parseInt(bf.readLine());
        int loc = 1;
        for(int i=0; i<num; i++) {
            String[] str = bf.readLine().split(" ");
            if(loc == Integer.parseInt(str[0])) {
                loc = Integer.parseInt(str[1]);
            } else if(loc == Integer.parseInt(str[1])) {
                loc = Integer.parseInt(str[0]);
            }
        }

        bw.write(loc+"");
        bw.flush();
        bf.close();
    }
}