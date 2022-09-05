import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_3986 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int n = Integer.parseInt(bf.readLine());
        int cnt = 0;
        for(int i=0; i<n; i++) {
            String s = bf.readLine();
            if(s.length()%2 == 0) {
                while(true) {
                    if(s.contains("AA")) {
                        s = s.replaceAll("AA", "");
                    } else if(s.contains("BB")) {
                        s = s.replaceAll("BB", "");
                    } else {
                        break;
                    }
                }
            }
            if(s.length() == 0) {
                cnt++;
            }
        }

        bw.write(cnt+"\n");
        bw.flush();  
        bw.close();  

    }
}
