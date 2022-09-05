import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException; 

public class baekjoon_2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int n = Integer.parseInt(bf.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++) {
            arr.add(Integer.parseInt(bf.readLine()));
        }
        Collections.sort(arr);

        for(int d : arr) {
            bw.write(d+"\n");
        }
        bw.flush();  
        bw.close();  

    }
}
