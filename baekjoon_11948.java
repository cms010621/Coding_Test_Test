import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon_11948 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        ArrayList<Integer> oto = new ArrayList<>();
        ArrayList<Integer> lib = new ArrayList<>();

        for(int i=0; i<4; i++) {
            oto.add(Integer.parseInt(bf.readLine()));
        }
        for(int i=0; i<2; i++) {
            lib.add(Integer.parseInt(bf.readLine()));
        }

        Collections.sort(oto, Collections.reverseOrder());
        Collections.sort(lib, Collections.reverseOrder());

        bw.write(oto.get(0) + oto.get(1) + oto.get(2) + lib.get(0) + "");

        bw.flush();
        bf.close();
    }
}