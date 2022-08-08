import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        String ans = "";

        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        if(a == b && b == c && c == 60) {
            ans = "Equilateral";
        } else if(a == b || b == c || a == c) {
            ans = "Isosceles";
        } else if(a + b + c != 180) {
            ans = "Error";
        } else {
            ans = "Scalene";
        }

        bw.write(ans);
        bw.flush();
        bf.close();
    }
}