import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.io.IOException; 

public class baekjoon_1057 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        String str[] = bf.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int kim = Integer.parseInt(str[1]);
        int lim = Integer.parseInt(str[2]);
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            arr.add(i);
        }

        int stand = 0;
        int chk = 0;

        while(true) {
            int arrS = arr.size();
            for(int i=0; i<(arrS%2 == 0 ? arrS : arrS-1); i+=2) {
                if(i+1 == arrS) {
                    // bw.write("i == arrS\n");
                    break;
                }
                // bw.write("i : " + i +" " + "\n");
                if((arr.get(i) == kim && arr.get(i+1) == lim) || (arr.get(i) == lim && arr.get(i+1) == kim)) {
                    chk = 1;
                    break;
                } else if(arr.get(i) == kim || arr.get(i) == lim) {
                    arr.remove(i+1);
                    i-- ;
                    arrS--;
                } else if(arr.get(i+1) == kim || arr.get(i+1) == lim) {
                    arr.remove(i);
                    i-- ;
                    arrS--;
                } else {
                    arr.remove(i);
                    i--;
                    arrS--;
                }
                
            }
            stand++;
            if(chk == 1) break;
        }

        bw.write(stand+" ");
        bw.flush();  
        bw.close();  

    }
}