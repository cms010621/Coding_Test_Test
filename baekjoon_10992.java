import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.IOException; 

public class baekjoon_10992 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int n = Integer.parseInt(bf.readLine());
        int blank = -1;
        for(int i=0; i<n-1; i++) {
            //빈칸
            for(int j=0; j<n-i-1; j++) {
                bw.write(" ");
            }
            bw.write("*");
            //중간 빈칸
            for(int j=0; j<blank; j++) {
                bw.write(" ");
            }
            if(i != 0) {
                bw.write("*");
            }
            bw.write("\n");
            blank +=2;
        }
        if(n != 1) {
            for(int i=0; i<n*2-1; i++) {
                bw.write("*");
            }
        } else {
            bw.write("*");
        }

        bw.write("\n");
        bw.flush();  
        bw.close();  

    }
}