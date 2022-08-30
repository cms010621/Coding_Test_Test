import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon_16435 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        String[] str = bf.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int l = Integer.parseInt(str[1]);
        String[] d =bf.readLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++) {
            arr.add(Integer.parseInt(d[i]));
        }
        Collections.sort(arr);

        for(int i=0; i<n; i++) {
            int loc = arr.get(i);
            if(l >= loc) {
                l++;
            } else {
                break;
            }
        }

        bw.write(l+"\n");
        bw.flush();
        bf.close();
    }
}