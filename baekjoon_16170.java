import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class baekjoon_16170 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        bw.write(format.format(date) + "\n");
        format = new SimpleDateFormat("MM");
        bw.write(format.format(date) + "\n");
        format = new SimpleDateFormat("dd");
        bw.write(format.format(date) + "");
       
        bw.flush();
        bf.close();
    }
}