import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_5218 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int cnt = Integer.parseInt(bf.readLine());
        for(int i=0; i<cnt; i++) {
            String[] str = bf.readLine().split(" ");
            int num = str[0].length();
            String val = "Distances:";
            for(int j=0; j<num; j++) {
                int a = str[0].charAt(j);
                int b = str[1].charAt(j);

                if(a > b) {
                    val += " " + (26 - (a - b));
                } else if(b > a) {
                    val += " " + (b - a);
                } else {
                    val += " 0";
                }
            }
            bw.write(val + "\n");
        }

        bw.flush();
        bf.close();
    }
}