import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException; 

public class baekjoon_2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int n = Integer.parseInt(bf.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            String[] str = bf.readLine().split(" ");
            arr.clear();
            for(String s : str) {
                arr.add(Integer.parseInt(s));
            }
            // Collections.reverse(arr); -- 23번 라인이랑 다른게 뭐지.? - 리스트를 그냥 거꾸로
            Collections.sort(arr, Collections.reverseOrder()); // 리스트를 내림차순
            bw.write(arr.get(2)+"\n");
        }

        bw.flush();  
        bw.close();  

    }
}