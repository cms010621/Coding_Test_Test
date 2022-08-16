import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_11098 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int cnt = Integer.parseInt(bf.readLine());
        for(int i=0; i<cnt; i++) {
            int num = Integer.parseInt(bf.readLine());
            String name = "";
            int max = 0;
            for(int j=0; j<num; j++) {
                String[] str= bf.readLine().split(" ");
                if(Integer.parseInt(str[0]) > max) {
                    max = Integer.parseInt(str[0]);
                    name = str[1];
                }
            }
            bw.write(name+"\n");
        }
        bw.flush();
        bf.close();
    }
}