import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon_2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        ArrayList<Integer> arr = new ArrayList<>();
        int ppl = 0;
        
        for(int i=0; i<10; i++) {
            String[] str = bf.readLine().split(" ");
            ppl -= Integer.parseInt(str[0]);
            ppl += Integer.parseInt(str[1]);
            arr.add(ppl);
        }

        Collections.sort(arr, Collections.reverseOrder());

        bw.write(arr.get(0) + "\n");
        bw.flush();
        bf.close();
    }
}