import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int max = 0;
        String maxLoc = "1 1";
        String [][] str = new String[9][9];
        for(int i=0; i<9; i++) {
            str[i] = bf.readLine().split(" ");
        }
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                int num = Integer.parseInt(str[i][j]);
                if(max < num) {
                    max = Integer.parseInt(str[i][j]);
                    maxLoc = (i+1) + " " + (j+1);
                }
            }
        }
        bw.write(max+"\n");
        bw.write(maxLoc+"\n");
        bw.flush();  
        bw.close();  

    }
}