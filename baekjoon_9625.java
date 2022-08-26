import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_9625 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int n = Integer.parseInt(bf.readLine());
        int a = 0;
        int b = 1;

        for(int i=1; i<n; i++) {
            int prev = a;
            a = b;
            b = prev+b;
        }

        if(n == 1) {
            bw.write("0 1");
        } else {
            bw.write(a+" ");
            bw.write(b + "\n");
        }
        bw.flush();
        bf.close();

        // Runtime.getRuntime().gc();
        // long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        // System.out.print(usedMemory + " bytes");
    }
}
