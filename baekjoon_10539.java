import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException; 

public class baekjoon_10539 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int num = Integer.parseInt(bf.readLine());
        if(num != 1) {
            String[] st = bf.readLine().split(" ");
            ArrayList<Integer> arr = new ArrayList<>(); // top 합계
            ArrayList<Integer> arr1 = new ArrayList<>();
            for(int i=0; i<num; i++) {
                arr.add(Integer.parseInt(st[i]) * (i+1));
            }
            arr1.add(arr.get(0));
            for(int i=1; i<num; i++) {
                arr1.add(arr.get(i) - arr.get(i-1));
            }
            for(int s : arr1) {
                bw.write(s + " ");
            }
        } else {
            bw.write(bf.readLine());
        }
        bw.flush();  
        bw.close();  

    }
}