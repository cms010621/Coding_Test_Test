import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class baekjoon_10214 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int num = Integer.parseInt(bf.readLine());
        ArrayList<String> arr = new ArrayList<>();

        for(int i=0; i<num; i++) {
            int yeon = 0;
            int kor = 0;
            for(int j=0; j<9; j++) {
                String[] st = bf.readLine().split(" ");
                int y = Integer.parseInt(st[0]);
                int k = Integer.parseInt(st[1]);
                if(i <num) {
                    if(y > k) {
                        yeon++;
                    } else if(y < k) {
                        kor++;
                    }
                }
            }
            arr.add(kor > yeon ? "Korea" : kor == yeon ? "Draw" : "Yonsei");    
        }

        int y = 0;
        int k = 0;
        for(String s : arr) {
        //     bw.write(s+"\n");
            if(s.equals("Korea")) {
                k++;
            } else if(s.equals("Yonsei")) {
                y++;
            } 
        }
        bw.write(k > y ? "Korea" : k == y ? "Draw" : "Yonsei");
    
        bw.flush();
        bf.close();
    }
}