import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException; 

public class baekjoon_10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int n = Integer.parseInt(bf.readLine());
        String str[] = bf.readLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            arr.add(Integer.parseInt(str[i]));
        }

        Collections.sort(arr);
        int last = 0;
        for(int i=0; i<arr.size(); i++) {
            if(last != arr.get(i)) {
                bw.write(arr.get(i) + " ");
                last = arr.get(i);
            }
        }

        bw.flush();  
        bw.close();  

    }
}