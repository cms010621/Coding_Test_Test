import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int num = Integer.parseInt(bf.readLine());
        int cnt = 0;
        for(int i=1; i<=num; i++) {
            String ss = String.valueOf(i);
            if(ss.length() == 1 || ss.length() == 2) {
                cnt++;
            } else if(ss.length() == 3) {
                int hun = i/100;
                int ten = i%100/10;
                int one = i%100%10;

                if(hun - ten == ten - one) {
                    cnt++;
                }
            }
        }

        bw.write(cnt+"\n");
        bw.flush();
        bf.close();
    }
}