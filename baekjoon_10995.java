import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_10995 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int n = Integer.parseInt(bf.readLine());
        String str = "";

        for(int i=0; i<n; i++) {
            if(i%2 == 1) {
                str +=" ";
            }
            for(int j=0; j<n; j++) {
                str += "* ";
            }
            bw.write(str+"\n");
            str = "";
        }

        bw.flush();
        bf.close();
    }
}