import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.io.IOException; 

public class baekjoon_2960 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        String str[] = bf.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=2; i<=n; i++) {
            arr.add(i);
        }
    
        int cnt = 0;
        int num = 0;
        while(true) {
            int stan = arr.get(0);
            for(int i=stan; i<=n; i+=stan) {
                if(arr.contains(i)) {
                    arr.remove(Integer.valueOf(i));
                    cnt++;
                    if(cnt == k) {
                        num = i;
                        break;
                    }
                }
            }
            if(cnt == k) {
                break;
            }
        }
       
        bw.write(num+"\n");
        bw.flush();  
        bw.close();  

    }
}