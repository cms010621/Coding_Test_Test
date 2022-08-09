import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon_1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        ArrayList<String> arr = new ArrayList<>();
        String str = "";
        int cnt = 1;

        int num = Integer.parseInt(bf.readLine());
        for(int i=0; i<num; i++) {
            arr.add(bf.readLine());
        }
        Collections.sort(arr);

        for(int i=1; i<num; i++) {
            if(arr.get(i-1).charAt(0) == arr.get(i).charAt(0)) {
                cnt++;
            } else {
                if(cnt >= 5) {
                    str += arr.get(i-1).charAt(0);
                }
                cnt = 1;
            }
            if(i == num-1 && cnt >= 5) {
                str += arr.get(i-1).charAt(0);
            }
        }

        bw.write(str.equals("") ? "PREDAJA" : str+"");
        bw.flush();
        bf.close();
    }
}