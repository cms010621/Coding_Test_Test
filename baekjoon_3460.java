import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon_3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int num = Integer.parseInt(bf.readLine());
        for(int i=0; i<num; i++) {
            int n = Integer.parseInt(bf.readLine());
            StringBuffer sb = new StringBuffer(Integer.toBinaryString(n));
            String reversedStr = sb.reverse().toString();
            for(int j=0; j<reversedStr.length(); j++) {
                if(reversedStr.charAt(j) == '1') {
                    bw.write(j + " ");
                }
            }
            bw.write("\n");
        }

       
        bw.flush();
        bf.close();
    }
}