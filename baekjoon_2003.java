import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class baekjoon_2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        String[] str = bf.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(bf.readLine().split(" ")));
        int cnt = 0;

        for(int i=0; i<n; i++) {
            int tot = Integer.parseInt(arr.get(i));
            if(tot < m && i != n-1) {
                for(int j=i+1; j<n; j++) {
                    tot += Integer.parseInt(arr.get(j));
                    if(tot >= m) {
                        break;
                    }
                }
            } 
            if(tot == m) {
                cnt++;
            }
        }
        bw.write(cnt+"\n");
        bw.flush();
        bw.close();
    }
}