import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_12790 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int num = Integer.parseInt(bf.readLine());
        for(int i=0; i<num; i++) {
            String[] st = bf.readLine().split(" ");
            int hp = Integer.parseInt(st[0]) + Integer.parseInt(st[4]) < 1 ? 1 : Integer.parseInt(st[0]) + Integer.parseInt(st[4]);
            int mp = Integer.parseInt(st[1]) + Integer.parseInt(st[5]) < 1 ? 1 : Integer.parseInt(st[1]) + Integer.parseInt(st[5]);
            int attack = Integer.parseInt(st[2]) + Integer.parseInt(st[6]) < 0 ? 0 : Integer.parseInt(st[2]) + Integer.parseInt(st[6]);
            int protect = Integer.parseInt(st[3]) + Integer.parseInt(st[7]);
            int tot =  (1 * hp) + (5 * mp) + (2 * attack) + (2 * protect);
            bw.write(tot+"\n");
        }
        bw.flush();  
        bw.close();  

    }
}