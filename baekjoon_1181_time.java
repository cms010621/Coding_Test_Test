import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_1181_time {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        int n = Integer.parseInt(bf.readLine());
        int max = 0;
        String[] arr = new String[n];

        arr[0] = bf.readLine();
        for(int i=1; i<n; i++) {
            String s = bf.readLine();
            int len = s.length();
            if(max < len) {
                arr[i] = s;
                max = len;
            } else if(max == len) {
                for(int j=max-1; j<=0; j--) {
                    if(arr[j].length() == len || arr[j-1].length() <len) {
                        
                    }
                }

            } else { // len < max

            }
            
            
        }


        bw.flush();  
        bw.close();  

    }
}