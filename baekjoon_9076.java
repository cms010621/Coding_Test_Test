import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException; 

public class baekjoon_9076 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int num = Integer.parseInt(bf.readLine());
        for(int i=0; i<num; i++) {
            String[] str = bf.readLine().split(" ");
            ArrayList<Integer> arr = new ArrayList<>();
            for(String s : str) {
                arr.add(Integer.parseInt(s));
            }
            Collections.sort(arr);
            arr.remove(arr.size()-1);
            arr.remove(0);
            int min = arr.get(0);
            int max = arr.get(arr.size()-1);
            if(max -min >= 4) {
                bw.write("KIN\n");
            } else {
                bw.write(arr.get(0) + arr.get(1) + arr.get(2)+"\n");
            }
        }
        bw.flush();  
        bw.close();  

    }
}