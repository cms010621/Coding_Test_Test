import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_1543{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        String str = bf.readLine();
        String word = bf.readLine();
        int cnt = 0;
        while(true) {
            if(str.contains(word)) {
                String tt = "";
                for(int i=0; i<word.length(); i++) {
                    tt += " ";
                }
                str = str.replaceFirst(word, tt);
                cnt++;
            }
            if(!str.contains(word)) {
                break;
            }
        }
        bw.write(cnt+"\n");
        bw.flush();
        bf.close();
    }
}