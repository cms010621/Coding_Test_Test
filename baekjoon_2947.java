import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class baekjoon_2947 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int[] arr = new int[5];
        String[] st = bf.readLine().split(" ");
        for(int i=0; i<5; i++) {
            arr[i] = Integer.parseInt(st[i]);
        }

        while(true) {
            for(int i=1; i<5; i++) {
                int fir = arr[i-1];
                int sec = arr[i];
                if(fir > sec) {
                    arr[i] = fir;
                    arr[i-1] = sec;
                    for(int j : arr) {
                        bw.write(j+" ");
                    }
                    bw.write("\n");
                }
            }
            if(arr[0] == 1 && arr[1] == 2 && arr[2] == 3 && arr[3] == 4 && arr[4] == 5) break;
        }

        bw.flush();  
        bw.close();  

    }
}