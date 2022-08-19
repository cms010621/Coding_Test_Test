import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_10103 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int n = Integer.parseInt(bf.readLine());
        int chang = 100;
        int sang = 100;
        for(int i=0; i<n; i++) {
            String[] str = bf.readLine().split(" ");
            int chang_dice = Integer.parseInt(str[0]);
            int sang_dice = Integer.parseInt(str[1]);
            if(chang_dice > sang_dice) {
                sang -= chang_dice;
            } else if(sang_dice > chang_dice) {
                chang -= sang_dice;
            }
        }

        bw.write(chang+"\n");
        bw.write(sang+"\n");
        bw.flush();  
        bw.close();  

    }
}