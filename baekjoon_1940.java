import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException; 

public class baekjoon_1940 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int n = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());
        String s[] = bf.readLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<>();

        for(String d : s) {
            arr.add(Integer.parseInt(d));
        }
        Collections.sort(arr);
        int 
        if(arr.contains(m)) {

        } else if(arr.get(arr.size() -1) < m) {

        }

        bw.write(cnt+"\n");
        bw.flush();  
        bw.close();  

    }
}
