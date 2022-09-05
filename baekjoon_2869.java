import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.io.IOException; 
import java.util.*;

public class baekjoon_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        String s[] = bf.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int V = Integer.parseInt(s[2]);
        int count = 1;

        count = (V-B)/(A-B);
        if(V-B == A) {
            count++;
        }
        else if(A-B > V) {
            count = 0;
        }
        else if((V-B)%(A-B)!=0) {
            count++;
        }

        bw.write(count+"\n");
        bw.flush();
        bw.close();
    }
}