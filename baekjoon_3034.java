import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class baekjoon_3034 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        String[] str = bf.readLine().split(" ");
        ArrayList<String> arr = new ArrayList<>();
        int n = Integer.parseInt(str[0]);
        int w = Integer.parseInt(str[1]);
        int h = Integer.parseInt(str[2]);
        double max = Math.pow(w, 2) + Math.pow(h, 2);

        for(int i=0; i<n; i++) {
            double num = Math.pow(Double.parseDouble(bf.readLine()), 2);
            if(num > max) {
                arr.add("NE");
            } else {
                arr.add("DA");
            }
        }

        for(String s : arr) {
            bw.write(s + "\n");
        }
        bw.flush();
        bf.close();
    }
}