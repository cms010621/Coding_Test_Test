import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_15649 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        
        String[] st = bf.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        String minNum = "";
        String maxNum = "";
        for(int i=1; i<=m; i++) {
            minNum += i;
        }
        for(int i=n; i> n-m; i--) {
            maxNum +=i;
        }
        bw.write(minNum + "\n");
        bw.write(maxNum + "\n");

        
        bw.flush();
        bf.close();
    }
}
