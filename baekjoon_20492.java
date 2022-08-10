import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_20492 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int n = Integer.parseInt(bf.readLine());

        int ans1 = n - (n/100*22);
        int ans2 = n/100*80;
        ans2 = ans2 + ((n-ans2) / 100 * 78);

        bw.write(ans1 + " " + ans2);
        bw.flush();
        bf.close();
    }
}