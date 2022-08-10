import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon_3058 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int num = Integer.parseInt(bf.readLine());
        for(int i=0; i<num; i++) {
            int tot = 0;
            String[] tt = bf.readLine().split(" ");
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int j=0; j<7; j++) {
                if(Integer.parseInt(tt[j])%2 == 0) {
                    arrayList.add(Integer.parseInt(tt[j]));
                    tot += Integer.parseInt(tt[j]);
                }
            }

            Collections.sort(arrayList);
            bw.write(tot +" " + arrayList.get(0) + "\n");

        }

        bw.flush();
        bf.close();
    }
}