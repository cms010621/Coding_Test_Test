import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_10178 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int cnt = Integer.parseInt(bf.readLine());
        for(int i=0; i<cnt; i++) {
            String str[] = bf.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            bw.write("You get " + a/b +" piece(s) and your dad gets " + a%b + " piece(s).\n");
        }


        bw.flush();
        bf.close();
    }
}