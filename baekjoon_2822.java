import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException; 

public class baekjoon_2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] array = new int[8];
        int tot = 0;

        for(int i=0; i<8; i++) {
            arr.add(Integer.parseInt(bf.readLine()));
            array[i] = arr.get(i);
        }

        Collections.sort(arr, Collections.reverseOrder());
        for(int i=0; i<5; i++) {
            tot += arr.get(i);
            for(int j=0; j<8; j++) {
                if(arr.get(i) == array[j]) {
                    arrayList.add(j+1);
                }
            }
        }
        Collections.sort(arrayList);
        bw.write(tot+"\n");
        for(int i : arrayList) {
            bw.write(i+" ");
        }
               
        bw.flush();  
        bw.close();  

    }
}