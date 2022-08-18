import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.io.IOException; 

public class baekjoon_2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int n = Integer.parseInt(bf.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> tr = new ArrayList<>();

        if(n != 1) {
            for(int i=1; i<=n; i++) {
                arr.add(i);
            }
            while(true) {
                tr.add(arr.get(0));
                arr.remove(0);
                arr.add(arr.get(0));
                arr.remove(0);
                if(arr.size() == 1) {
                    tr.add(arr.get(0));
                    break;
                }
            }
    
            for(int s : tr) {
                bw.write(s + " ");
            }
        } else {
            bw.write("1");
        }

        bw.flush();  
        bw.close();  

    }
}