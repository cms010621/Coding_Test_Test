import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class baekjoon_9325 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        ArrayList<Integer> arr = new ArrayList<>();

        int num = Integer.parseInt(bf.readLine());
        for(int i=0; i<num; i++) {
            int price = Integer.parseInt(bf.readLine());
            int cnt = Integer.parseInt(bf.readLine());
            if(cnt != 0) {
                for(int j=0; j<cnt; j++) {
                    String[] st = bf.readLine().split(" ");
                    price += Integer.parseInt(st[0]) * Integer.parseInt(st[1]);
                }
            }
            arr.add(price);

        }

        for(int i : arr) {
            bw.write(i + "\n");
        }
       
        bw.flush();
        bf.close();
    }
}