import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon_13301 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int n = Integer.parseInt(bf.readLine());
        long tot = 0;
        ArrayList<Long> arr = new ArrayList<>();
        arr.add(1L);
        arr.add(1L);

        for(int i=1; i<n; i++) {
            arr.add(arr.get(i-1) + arr.get(i));
        }
        Collections.reverse(arr);
        if(n < 3) {
            if(n == 2) {
                tot = 6;
            } else {
                tot = 4;
            }
        } else {
            for(int i=0; i<4; i++) {
                if(i == 1 || i == 2) {
                    tot += arr.get(i)*2;
                } else {
                    tot += arr.get(i);
                }
            }
        }
        bw.write(tot+"");
        bw.flush();
        bf.close();
    }
}