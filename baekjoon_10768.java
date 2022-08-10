import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_10768 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int month = Integer.parseInt(bf.readLine());
        int day = Integer.parseInt(bf.readLine());
        int preMonth = 2;
        int preDay = 18;


        if(month < preMonth || (month == preMonth && day < preDay)) {
            bw.write("Before");
        } else if(month == preMonth && day == preDay) {
            bw.write("Special");
        } else {
            bw.write("After");
        }

        bw.flush();
        bf.close();
    }
}