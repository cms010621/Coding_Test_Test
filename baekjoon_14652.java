import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_14652 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        String str[] = bf.readLine().split(" ");
        
        int n = Integer.parseInt(str[2])/Integer.parseInt(str[1]);
        int m = Integer.parseInt(str[2])%Integer.parseInt(str[1]);
       
        bw.write(n + " " + m);
        bw.flush();
        bf.close();
    }
}