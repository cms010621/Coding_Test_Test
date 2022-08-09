import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class baekjoon_9085 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int n = Integer.parseInt(bf.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int d = Integer.parseInt(bf.readLine());
            String[] st = bf.readLine().split(" ");
            int tot = 0;
            for(int j=0; j<d; j++) {
                tot += Integer.parseInt(st[j]);
            }
            arr.add(tot);
        }

        for(int i : arr) {
            bw.write(i + "\n");
        }

        bw.flush();
        bf.close();
    }
}