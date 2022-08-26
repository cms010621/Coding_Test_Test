import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_2979 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        String[] str = bf.readLine().split(" ");
        int[] tt = new int[101];
        int tot = 0;
        int min = 0;
        int max = 0;
        for(int i=0; i<3; i++) {
            String[] ss = bf.readLine().split(" ");
            int start = Integer.parseInt(ss[0]);
            int end = Integer.parseInt(ss[1]);
            if(start < min) {
                min = start;
            }
            if(max < end) {
                max = end;
            }
            for(int j=start+1; j<=end; j++) {
                tt[j] = tt[j]+=1;
            }
        }
        for(int i=min; i<=max; i++) {
            if(tt[i] == 3) {
                tot += Integer.parseInt(str[2]) * 3;
            } else if(tt[i] == 2) {
                tot += Integer.parseInt(str[1]) * 2;
            } else if(tt[i] == 1) {
                tot += Integer.parseInt(str[0]);
            }
        }

        bw.write(tot+"\n");
        bw.flush();  
        bw.close();  

    }
}