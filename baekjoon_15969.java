import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class baekjoon_15969 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int cnt = Integer.parseInt(bf.readLine());
        String[] st = bf.readLine().split(" ");
        List<String> arr = Arrays.asList(st);
        Collections.sort(arr);
        
        bw.write(Integer.parseInt(arr.get(cnt-1)) - Integer.parseInt(arr.get(0)) + "");
        bw.flush();
        bf.close();
    }
}