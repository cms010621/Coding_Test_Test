import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int n = Integer.parseInt(bf.readLine());
        int fif = 0;
        int two = 0;
        int cnt = 50000;
        for(int i=n/5; i>=0; i--) {
            int tot = 0;
            fif = i;
            two = (n-(i*5))/2;
            if((n-(i*5))%2 == 0) {
                tot = fif + two;
                if(tot < cnt) {
                    cnt = tot;
                }
            }

        }
        if(n == 0 || cnt == 50000) {
            bw.write("-1");
        } else {
            bw.write(cnt+"");
        }
        bw.flush();
        bf.close();
    }
}