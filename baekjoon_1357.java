import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_1357{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        String[] str = bf.readLine().split(" ");
        int revX = rev(str[0]);
        int revY = rev(str[1]);
        int revTot = revX + revY;

        bw.write(rev(String.valueOf(revTot))+"\n");
        bw.flush();  
        bw.close();  

    }

    public static int rev(String num) {
        StringBuffer sb = new StringBuffer(num);
        String revStr = sb.reverse().toString();
        return Integer.parseInt(revStr);
    }
}