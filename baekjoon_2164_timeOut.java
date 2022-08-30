import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class baekjoon_2164_timeOut {
    public static void main(String[] args) throws IOException {
        long beforeTime = System.currentTimeMillis();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int n = Integer.parseInt(bf.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            arr.add(i);
        }

        while(true) {
            if(arr.size() == 1) break;
            arr.remove(0);
            arr.add(arr.get(0));
            arr.remove(0);
        }
        bw.write(arr.get(0)+"");
        bw.flush();
        bf.close();
    }
}