import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_10984 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int cnt = Integer.parseInt(bf.readLine());
        double[][] st = new double[cnt][2];
        for(int i=0; i<cnt; i++) {
            int num = Integer.parseInt(bf.readLine());
            double tot = 0;
            for(int j=0; j<num; j++) {
                String[] str = bf.readLine().split(" ");
                st[i][1] += Double.parseDouble(str[1]) * Double.parseDouble(str[0]);
                tot += Integer.parseInt(str[0]);
            }
            st[i][0] = tot;
            st[i][1] = st[i][1] / tot;
        }

        for(int i=0; i<cnt; i++) {
            bw.write((int) st[i][0] + " " + String.format("%.1f", st[i][1]) + "\n");
        }
        
        bw.flush();
        bf.close();
    }
}