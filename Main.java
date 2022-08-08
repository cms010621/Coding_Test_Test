import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.io.IOException; 
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        String[] s = bf.readLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        for(String d: s) {
            arr.add(Integer.parseInt(d));
        }

        int min = 0;
        //세개를 만족하는 최소공배수
        //그냥 다 해봐야되는듯.
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                for(int k=0; k<5; k++) {
                    
                }
            }
        }
        
        bw.flush();
        bw.close();
    }
}