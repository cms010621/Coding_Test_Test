import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon_25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        String[] str=  bf.readLine().split(" ");
        int n = Integer.parseInt(str[1]);
        String[] s = bf.readLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        for(String d : s) {
            arr.add(Integer.parseInt(d));
        }
        Collections.sort(arr, Collections.reverseOrder());
        bw.write(arr.get(n-1)+"");
        bw.flush();
        bf.close();
    }
}
