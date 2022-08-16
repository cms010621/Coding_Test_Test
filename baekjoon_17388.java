import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_17388 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        String str[] = bf.readLine().split(" ");
        int soong = Integer.parseInt(str[0]);
        int kor = Integer.parseInt(str[1]);
        int han = Integer.parseInt(str[2]);

        if(soong + kor + han >= 100) {
            bw.write("OK");
        } else if(soong < kor && soong < han) {
            bw.write("Soongsil");
        } else if(kor < soong && kor < han) {
            bw.write("Korea");
        } else {
            bw.write("Hanyang");
        }

        bw.flush();
        bf.close();
    }
}