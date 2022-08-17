import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        String s = bf.readLine();
        int cnt1 = 0;
        int cnt0 = 0;

        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) != s.charAt(i-1)) {
                if(s.charAt(i-1) == '1') {
                    cnt1++;
                } else {
                    cnt0++;
                }
            }
        }
        if(s.charAt(s.length()-1) == '1'){
            cnt1++;
        } else {
            cnt0++;
        }

        bw.write((cnt0 > cnt1 ? cnt1 : cnt0)+"\n");
        bw.flush();  
        bw.close();  

    }
}