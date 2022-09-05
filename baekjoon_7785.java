import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int n = Integer.parseInt(bf.readLine());
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            String status = bf.readLine();
            String name = status.split(" ")[0];
            if(status.contains("enter")) {
                if(!arr.contains(name)) {
                    arr.add(name);
                }
            } else if(status.contains("leave")) {
                if(arr.contains(name)) {
                    arr.remove(name);
                }
            }
        }
        Collections.sort(arr, Collections.reverseOrder());
        for(String d : arr) {
            bw.write(d+"\n");
        }
        bw.flush();
        bf.close();
    }
}