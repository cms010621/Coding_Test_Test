import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_1297 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        String str[] = bf.readLine().split(" ");
        int d = Integer.parseInt(str[0]);
        int h = Integer.parseInt(str[1]);
        int w = Integer.parseInt(str[2]);

        for(int i=1; i<d; i++) {

        }

       
        bw.flush();
        bf.close();
    }
}