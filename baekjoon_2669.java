import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_2669 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int[][] arr = new int[100][100];
        int tot=0;
        
        for(int i=0; i<4; i++) {
            String[] str = bf.readLine().split(" ");
            int x1 = Integer.parseInt(str[0]);
            int y1 = Integer.parseInt(str[1]);
            int x2 = Integer.parseInt(str[2]);
            int y2 = Integer.parseInt(str[3]);

            for(int j=x1; j<x2; j++) {
                for(int k=y1; k<y2; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        for(int i=0; i<100; i++) {
            for(int j=0; j<100; j++) {
                if(arr[i][j] == 1) {
                    tot++;
                }
            }
        }

        bw.write(tot+"");
        bw.flush();  
        bw.close();  

    }
}