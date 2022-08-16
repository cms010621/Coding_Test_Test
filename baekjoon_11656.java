import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException; 

public class baekjoon_11656 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        String str = bf.readLine();
        ArrayList<String> arr = new ArrayList<>();

        for(int i=0; i<str.length(); i++) {
            arr.add(str.substring(i));
        }
        Collections.sort(arr);
        for(String s : arr) {
            bw.write(s + "\n");
        }

        bw.flush();  
        bw.close();  

    }
}
