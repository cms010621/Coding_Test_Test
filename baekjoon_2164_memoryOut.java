import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_2164_memoryOut {
    public static void main(String[] args) throws IOException {
        long beforeTime = System.currentTimeMillis();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int n = Integer.parseInt(bf.readLine());
        String a = "";

        for(int i=1; i<=n; i++) {
            a+=i;
        }

        while(true) {
            if(a.length() == 1) break;
            a = a.substring(1);
            a += a.charAt(0);
            a = a.substring(1);
        }
        bw.write(a+"\n");
        bw.flush();
        bf.close();
        long afterTime = System.currentTimeMillis(); 
        long secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println("시간차이(m) : "+secDiffTime);
    }
}