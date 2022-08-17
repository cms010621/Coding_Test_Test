import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_2167 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        String[] st = bf.readLine().split(" ");

        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++) {
            String[] s = bf.readLine().split(" ");
            for(int j=0; j<m; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }

        int k = Integer.parseInt(bf.readLine());
        for(int d=0; d<k; d++) {
            String[] s = bf.readLine().split(" ");
            int i = Integer.parseInt(s[0])-1;
            int j = Integer.parseInt(s[1])-1;
            int x = Integer.parseInt(s[2])-1;
            int y = Integer.parseInt(s[3])-1;
            int tot = 0;
            for(int w = i; w<=x; w++) {
                for(int f = j; f<=y; f++) {
                    tot += arr[w][f];
                }
            }
            bw.write(tot+"\n");
        }

        bw.flush();  
        bw.close();  

    }
}
