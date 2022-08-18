import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException; 

public class baekjoon_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        String []arr = bf.readLine().split(" ");
        ArrayList<String> arrA = new ArrayList<>(Arrays.asList(bf.readLine().split(" ")));
        ArrayList<String> arrB = new ArrayList<>(Arrays.asList(bf.readLine().split(" ")));
        int aCnt = 0;
        int bCnt = 0;

        for(int i=0; i<Integer.parseInt(arr[0]); i++) {
            if(!arrB.contains(arrA.get(i))) {
                aCnt++;
            }
        }

        for(int i=0; i<Integer.parseInt(arr[1]); i++) {
            if(!arrA.contains(arrB.get(i))) {
                bCnt++;
            }
        }

        bw.write(aCnt + bCnt+"");
        bw.flush();  
        bw.close();  

    }
}