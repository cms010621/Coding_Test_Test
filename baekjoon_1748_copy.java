import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_1748_copy {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int n = Integer.parseInt(bf.readLine());
        long tot = 0;
        int length = String.valueOf(n).length();

        for(int i=1; i<length; i++) {
            String max = "1";
            String min = "1";
            for(int j=0; j<i; j++) {
                max += "0";
            }
            for(int j=1; j<i; j++) {
                min += "0";
            }
            tot += (Integer.parseInt(max) - Integer.parseInt(min))*i;
        }
        String min = "1";
        for(int j=1; j<length; j++) {
            min += "0";
        }
        int calc = (n-Integer.parseInt(min)+1)*length;
        tot += calc;
        bw.write(tot+"\n");
        bw.flush();
        bf.close();
    }
}