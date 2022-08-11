import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.io.IOException; 

public class baekjoon_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        ArrayList<Integer> arr = new ArrayList<>();

        String str[]= bf.readLine().split(" ");
        int cnt = Integer.parseInt(str[0]);
        int val = Integer.parseInt(str[1]);
        int num=0;

        for(int i=0; i<cnt; i++) {
            arr.add(Integer.parseInt(bf.readLine()));
        }

        for(int i=cnt-1; i>=0; i--) {
            if(val >= arr.get(i)) {
                num += val/arr.get(i);
                val = val%arr.get(i);
            }
        }

        bw.write(num + "");
        bw.flush();
        bf.close();
    }
}