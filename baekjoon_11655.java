import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_2523 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        
        String str[] = bf.readLine().split("");
        String a = "";
        for(int i=0; i<str.length; i++) {
            char st = str[i].charAt(0);
            if(st >= 'A' && st <= 'Z') { //알파벳 대문자
                if(st + 13 > 'Z') {
                    a += (char)(st - 13);
                } else {
                    a += (char)(st + 13);
                }
            } else if(st >= 'a' && st <= 'z') { // 알파벳 소문자
                if(st + 13 > 'z') {
                    a += (char)(st - 13);
                } else {
                    a += (char)(st + 13);
                }
            } else {
                a += st;
            }
        }

        bw.write(a + "\n");
        bw.flush();
        bf.close();
    }
}
