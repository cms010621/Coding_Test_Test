import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder;

import java.io.IOException; 

public class baekjoon_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int n = Integer.parseInt(bf.readLine());
        int tot = 0;
        int[][] arr = new int[100][100];
        for(int i=0; i<n; i++) {
            String[] str = bf.readLine().split(" ");
            int w = Integer.parseInt(str[0]);
            int h = Integer.parseInt(str[1]);

            for(int j=w; j<w+10; j++) {
                for(int k=h; k<h+10; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        for(int i=0; i<100; i++) {
            for(int k=0; k<100; k++) {
                if(arr[i][k] == 1) {
                    tot++;
                }
            }
        }

        bw.write(tot+" "+"\n");
        bw.flush();  
        bw.close();  

    }
}